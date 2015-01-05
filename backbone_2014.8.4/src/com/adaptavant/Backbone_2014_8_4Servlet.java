package com.adaptavant;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.google.appengine.api.datastore.*;


@SuppressWarnings("serial")
@Controller

public class Backbone_2014_8_4Servlet extends HttpServlet {
	
	@RequestMapping(value="/")
	public String homepage(HttpServletRequest request, HttpServletResponse response)throws IOException{
		
		return "todo";
	}
	@RequestMapping(value="/addtodo",method = RequestMethod.GET)
	public String TodoPost(HttpServletRequest request, HttpServletResponse response)throws IOException{
		
		return "";
	}
DatastoreService ds=DatastoreServiceFactory.getDatastoreService();
	
	Entity todo = new Entity("Todolist");
	public void doPost(HttpServletRequest request, HttpServletResponse response	)
			throws IOException{
		
		BufferedReader reader = request.getReader();
//		System.out.println(request.getReader());
		StringBuilder sb = new StringBuilder();
	
	    try {
	        String list;
	        while ((list = reader.readLine()) != null) {
	            sb.append(list);
	        }
	    } finally {
	        reader.close();
	    }
	    JSONObject jsonobj;
		try {
			
			jsonobj = new JSONObject(sb.toString());
			todo.setProperty("Values", jsonobj.get("todoitem"));
			//todo.setProperty("id", jsonobj.get("id"));
			ds.put(todo);
		
			
		 } catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		PrintWriter out = response.getWriter();
		out.print(sb);
		}
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)

			throws IOException {
		//System.out.print(req.getAttribute()));
		JSONObject jo = new JSONObject();
		Query q = new Query("Todolist");
		PreparedQuery pq=ds.prepare(q);
		for(Entity Todolist:pq.asIterable())
		{
		String values=Todolist.getProperty("Values").toString();
		System.out.println(values);
		try {
				jo.put("",values);
				jo.put("", values);
				} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		
		
		resp.setContentType("application/json");
		PrintWriter out = resp.getWriter();
		out.print(jo);
		out.close();
	}

	



}



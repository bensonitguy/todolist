	<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
	<!DOCTYPE html>
	<html>
	<head>
	  <script src="/jquery/jquery-1.7.1.min.js"></script>
	 <link rel="stylesheet" type="text/css" href="/css/bootstrap.min.css">
	 <script type="text/javascript" src="/js/bootstrap.min.js"></script>
	  <script src="/js/underscore-min.js"></script>
	 <script src="/js/backbone-min.js"></script>
	 <script src="//cdnjs.cloudflare.com/ajax/libs/underscore.js/1.6.0/underscore-min.js"></script>
	 <script src="//cdnjs.cloudflare.com/ajax/libs/backbone.js/1.1.2/backbone-min.js"></script>
	
	 </head>
	 <body>
	  <div class="container">
	 <h1>This is my backbone Page</h1>
	 <hr/>
	 <div class="page">
	<h3>hello world</h3>
	 </div>
	  </div>
	    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
		 <script type="text/template" id="userslist" >

         
 <input type="text" class="form-control" placeholder="What to do next?" name="todo_item" id="todo_item"/>
<hr/>
<button class="btn btn-primary" id="addnew_item">New Todo</button>
<table class="table striped">
 <thead>
<tr>
<td>
Todo List
</td>
</tr>
</thead>
<tbody>
	
</tbody>
</table>
<div id='chart_div'></div>
	</script>
	
	 <script type="text/javascript" src="/backbone/TodoView.js"></script>
	
	 
	 </body>
	</html>
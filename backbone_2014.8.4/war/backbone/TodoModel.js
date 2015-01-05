var app = app || {};

(function($)
		{
				app.TodoModel				= 		new Backbone.Model.extend({
								defaults    : 		{
													id : Math.floor((Math.random() * 100) + 1);;,
													todoitem : ''
													},
								initialize	:		{
													
													}					
					
													
						
													});	
})(jquery);

var todomodel = new app.TodoModel();
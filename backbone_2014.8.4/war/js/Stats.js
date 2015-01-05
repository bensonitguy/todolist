
      // Load the Visualization API and the piechart package.
      google.load('visualization', '1.0', {'packages':['corechart']});

      // Set a callback to run when the Google Visualization API is loaded.
      google.setOnLoadCallback(drawChart);

      // Callback that creates and populates a data table,
      // instantiates the pie chart, passes in the data and
      // draws it.
      function drawChart() {

        // Create the data table.
        var data = new google.visualization.DataTable();
        data.addColumn('string', 'services');
        data.addColumn('number', 'visited');
        data.addRows([
          ['Massage', 3],
          ['Medicure', 3],
          ['Pedicure', 3],
          ['Haircut', 3],
          ['Blowout', 3]
        ]);

        // Set chart options
        var options = {'title':'Services',
                       'width':400,
                       'height':400,
                       titleTextStyle:
                       {
                    	   color:'grey'
                       }
        			  };

        // Instantiate and draw our chart, passing in some options.
        var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
        chart.draw(data, options);
      }
    
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
        <script src="js/jquery.browser.min.js" type="text/javascript"></script>
        <link rel="stylesheet" href="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.css">
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.9.0/jquery.min.js"></script>
        <script src="js/jquery.browser.min.js" type="text/javascript"></script>
        <script src="js/canvasjs.min.js" type="text/javascript"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
        <script src="//cdnjs.cloudflare.com/ajax/libs/morris.js/0.5.1/morris.min.js"></script>
        <title>Residuos</title>
        <script src="js/jquery.jqplot.min.js" type="text/javascript"></script>
        <link href="js/jquery.jqplot.min.css" rel="stylesheet" type="text/css"/>
        <script src="js/jqplot.meterGaugeRenderer.min.js" type="text/javascript"></script>
        <script src="js/canvasjs.min.js" type="text/javascript"></script>
        <script language="javascript" type="text/javascript" src="js/excanvas.js"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/canvasjs.min.js" type="text/javascript"></script>
        <script language="javascript" type="text/javascript" src="js/excanvas.js"></script>
        
        
    </head>
    <body>
        <sql:setDataSource var="snapshot" driver="com.mysql.jdbc.Driver"
            url="jdbc:mysql://localhost/idic"
            user="root"  password="root"/>

        <sql:query dataSource="${snapshot}" var="result">
             SELECT * from distritos_co2;
        </sql:query>
        <div data-role="page">
            

                <jsp:include page="navbar.jsp"></jsp:include>
            
                <div data-role="main" style="padding-top: 10px" >
                    
                    
                    <table  border="1" align="center" style="width: 70%">

                        <tr align="center" style="background: #99ccff">
                            <td><span>Gráfica</span></td>
                            
                            <td>Distrito</td>
                            <td>TnCO2</td>
                            
                        </tr>
                        <tbody>
                            
                                <td rowspan="44"  ><div id='chart4'></div></td>
                            <c:forEach var="row" items="${result.rows}">
                                <tr>
                                    <td style="width: 25%" > 
                                        <a href="Residuos.jsp?n=${row.residuos}">${row.distrito}</a>
                                    </td>
                                <td align="center" style="width: 20%" >${row.residuos}</td>
                                
                                  
                               </tr> 
                            </c:forEach>
                               </td>
                        
                        </tbody>
                        
                    </table>
                        
                    <div id="chartContainer" style="height: 300px; width: 100%;"></div>
                </div>
        </div>
                
        
        <script>
            setTimeout(
                    
            function (){
                
                s1 = [<%=request.getParameter("n")%> ];
                        

            plot4 = $.jqplot('chart4',[s1],{
                seriesDefaults: {
                    renderer: $.jqplot.MeterGaugeRenderer,
                    rendererOptions: {
                        
                        label: 'CO2',
                        labelPosition: 'bottom',
                        labelHeightAdjust: -5,
                        intervalOuterRadius: 85,
                        ticks: [7000, 180000, 200000, 250000],
                        intervals:[80000, 180000, 250000],
                        intervalColors:['#66cc66', '#E7E658', '#cc6666']
                    }
                }
            });
                
            
            var chart = new CanvasJS.Chart("chartContainer",
    {
          
      data: [
          
      {
        click: onClick,
        name:"Consumo Eléctrico",
        dataPoints: [
            <c:forEach var="r" items="${result.rows}">
                {y: ${r.residuos}, label: "${r.distrito}"},
            </c:forEach>
        
        ]
      }
      ]
    });
           chart.render();               
            function onClick(e) {
		alert(  e.dataSeries.name +"\n"+e.dataPoint.label + "\nCO2:" + e.dataPoint.y  );
	}
                },500);
        </script>
    </body>
</html>

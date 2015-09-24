
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
        <jsp:include page="navbar.jsp"></jsp:include>
        <div class="container">
            <h2>Ingreso de datos</h2>
            <form class="form-horizontal" role="form" action="encuestaTrans" >
                <div class="form-group">
                    <label class="control-label col-sm-2" for="consumo">Transporte públco:</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="consumo" name="consumo" placeholder="Tiempo en horas">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2" for="personas">Consumo de gasolina:</label>
                    <div class="col-sm-5">          
                        <input type="text" class="form-control" id="personas" name="personas" placeholder="Monto invertido en gasolina">
                    </div>
                </div>
                

            </form>
        </div>
    </body>
</html>

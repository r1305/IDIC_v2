
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Facebook Login JavaScript Example</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
    </head>
    <body>
        

    <div id="status">
    </div>
    
    <div class="container">
            <h2>Ingreso de datos</h2>
            <form class="form-horizontal" role="form" action="Guardar" >
                <div class="form-group">
                    <label class="control-label col-sm-2" for="consumo">Bolsas:</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="consumo" name="consumo" placeholder="Ingrese el consumo total de KW">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2" for="personas">Numero de Personas:</label>
                    <div class="col-sm-5">          
                        <input type="text" class="form-control" id="personas" name="personas" placeholder="Ingrese el numero de personas en la vivienda">
                    </div>
                </div>
                
                <div class="form-group">        
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">Siguiente</button>
                    </div>
                </div>

            </form>
        </div>

</body>
</html>
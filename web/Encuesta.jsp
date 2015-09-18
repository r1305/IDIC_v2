
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <title>Encuesta</title>
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
  <form role="form">
    <div class="form-group">
      <label for="kw">KW:</label>
      <input type="text" class="form-control" id="kw" placeholder="Ingrese su consumo de KW">
      
    </div>
    <div class="form-group">
      <label for="personas">Número de personas:</label>
      <input type="text" class="form-control" id="pwd" placeholder="Ingrese la cantidad de pesonas que viven en su casa">
    </div>
        <button type="submit" class="btn btn-primary">Submit</button>
  </form>
</div>

</body>
</html>

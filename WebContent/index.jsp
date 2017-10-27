<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>

<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link rel="icon" href="${pageContext.request.contextPath}/img/favicon.png">
	
    <title>Widget Tiempo</title>
    
    <!-- Meteocons ICONS -->
    <link href="${pageContext.request.contextPath}/vendors/meteocons/stylesheet.css" rel="stylesheet">
    
    <!-- Bootstrap core CSS -->
    <link href="${pageContext.request.contextPath}/vendors/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/vendors/bootstrap/css/bootstrap-theme.min.css" rel="stylesheet">  
    
    <!-- font-awesome 4.0 -->
    <link href="${pageContext.request.contextPath}/vendors/font-awesome-4.7.0/css/font-awesome.min.css" rel="stylesheet">
    
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
</head>

<body class="container">
<div class="container">
	<div class="row centered-form">
		
	    <h2>Widget Tiempo</h2>
	    <hr>
	    
	    <%
	    if (request.getAttribute("msg") != null) {
	    %>
		<!-- parametro que viene en la URL-->    
		<div class="panel-red panel-default">    
        		<h3 class="panel-title">${msg}</h3>
        </div>	
        <%
        }
        %>
        	
	     <div class="col-xs-12 col-sm-8 ">
        	<div class="panel panel-default">
        		<div class="panel-heading">
			    	<h3 class="panel-title">Introduzca la ciudad de la que desee obtener la predicción <small>(*) campos obligatorios</small></h3>
			 	</div>
			 	<div class="panel-body">
			 			
			    		<form action="${pageContext.request.contextPath}/consulta" method="post">
			    			<div class="row">
			    				<div class="col-xs-6">
			    					<div class="form-group">
						    			<label class="descrip">Nombre ciudad(*):</label>
						                <input type="text" name="localizacion" class="form-control input-sm floatlabel" placeholder="localización" required>
			    					</div>
			    				</div>
			    				<div class="col-xs-6 col-sm-6 col-md-6">
			    					<div class="form-group">
			    						<legend class="descrip">Tipo de grados:</legend>
											<select name="tipoGrados" class="form-control input-sm floatlabel">
											  <option value="1" selected>Celsius</option>
											  <option value="2">Farenheit</option>
											  <option value="3">Kelvin</option>
											</select>	
			    					</div>
			    				</div>
			    			</div>
	
	<!-- 
			    			<div class="form-group">
			    				<label class="descrip">Tipo de grados (*):</label>
			    				<input type="text" name="grados" id="grados" class="form-control input-sm" placeholder="Especifique su edad">
			    			</div>
	 -->
			    		
			    			
			    			<input type="submit" value="Register" class="btn btn-info btn-block">
			    		</form>
			    		
			    	</div> <!-- div panel body -->
			    </div> <!-- div panel heading -->
			</div> <!-- div col -->
		</div> <!-- div row -->
			    
	    
	  
	    
	    
	</div>	

</div> <!-- div del container -->
</body>


</html>
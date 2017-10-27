<%@page import="pojo.Tiempo"%>
<!DOCTYPE html>

<html lang="es">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">    
    <link rel="icon" href="${pageContext.request.contextPath}/img/favicon.png">

    <title>Widget Tiempos</title>
	
	<!-- Meteocons ICONS -->
    <link href="${pageContext.request.contextPath}/vendors/meteocons/stylesheet.css" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Open+Sans" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/styles.css" rel="stylesheet">
   
</head>

<body>
	<div class="container widget-text" >
		<div class="container-morado">
			<!-- SI RECIBES UN OBJETO DEBES CASTEARLO: xej. Persona p = (Persona)request.getAttribute("p"); -->
			
			<%
			int tipoGrados = Integer.parseInt((String)request.getAttribute("tipoGrados"));
			String grados = "";
			switch(tipoGrados){
				case 1:
					grados = "ºC";
					break;
				case 2:
					grados = "ºF";
					break;
				case 3:
					grados = "K";
					break;
			}
			//Tiempo t = null;
			Tiempo t  = (Tiempo)request.getAttribute("t");
			
			//	Tiempo tiempo=(Tiempo)request.getAttribute("tiempo");
			 %>
			
			
			
			<br>
			
			<div class="container-blanco">
				<br><br>
				<p class="icon" data-icon="${t.getLetraIcono()}"></p>
			</div>	<!-- div container-blanco -->
			<div>
				<div> <!-- @see https://geeks.ms/santypr/2015/01/02/html-css-eliminar-espacio-entre-los-elementos-en-lnea-inline-block/ -->
					<div class="container-gris-temp"><br>
						${ t.getTemperatura(tipoGrados) }
						<%=grados %><br></div
					><div class="container-gris-ciudad"
					
					>${t.getDescripcion() }<br>
					<%=t.getLocalizacion() %></div
					><div class="container-azul">
						${t.getMes() }<br>
						<%=t.getDia() %>
					
					</div>
				</div>	
				<!--  <p class="widget-text">TRALARIIII widget</p>	-->
				
			</div> <!-- container-multiContainer (gris+gris+azul) -->
		</div>	<!-- div container-morado -->
	</div> <!-- div del CONTAINER -->
	
				<!-- 
				<p>FECHA ATRIBUTOS ANTES: <b>${fecha}</b></p>
				<p>Ciudad: <b>${localizacion}</b></p>
				<p>El tipo de grados seleccionado es: <b>${tipoGrados}</b></p>
				
				<p>POJO AHORA:</p><br>
				<%=t.getLocalizacion() %><br>
				<%=t.getTemperatura(tipoGrados) %><br>
				<br>
				<%=t.getTemperatura(1) %><br>
				<%=t.getTemperatura(2) %><br>
				<%=t.getTemperatura(3) %><br>
				<%=t.getDescripcion() %><br>
				<%=t.getLetraIcono() %><br>
				<%=t.getFecha() %><br>
				-->
				<!-- Meteocons ICONS: -->
				<!-- 
				letraIcon = ${t.getIconoTiempo()}
				${ t.getDia() }
				${ t.getMes() }
				-->
				
				<!-- 
				<p class="icon" data-icon="${t.getLetraIcono()}">${t.getDescripcion()}</p>
				
				<p class="icon" data-icon="F">TTTRRAAAL</p>
				<p class="icon" data-icon="M"> MMMMM</p>
				-->
	
	
</body>


</html>
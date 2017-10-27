package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pojo.Tiempo;

/**
 * Servlet implementation class ConsultaTiempoController
 */
@WebServlet("/consulta")
public class ConsultaTiempoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String msg = "Mensaje para el usuario";
		String view = "resultado.jsp";
		String localizacion = request.getParameter("localizacion");
		String tipoGrados = request.getParameter("tipoGrados");
		
		try {
			Tiempo t = null;
			//t = new Tiempo();
			//t.setLocalizacion(localizacion);
			//t.setTemperatura(temperatura);
			//t = new Tiempo("Bilbao","22/10/33","18");
			
			//Tiempo(String localizacion, int temperatura, String descripcion, char letraIcono) {
			
			
			if("".equals(localizacion) || "".equals(tipoGrados)) {
				msg = "Ha habido algun tipo de error. Pruebe de nuevo";
				view = "index.jsp";
			}else if ("Bilbao".equalsIgnoreCase(localizacion) || "Bilbo".equalsIgnoreCase(localizacion)) {
				t = new Tiempo("Bilbao", 18, "lluvia", 'B');
			}else if ("Londres".equalsIgnoreCase(localizacion) || "London".equalsIgnoreCase(localizacion)) {
				t = new Tiempo("Londres", 20, "soleado", 'R');
			}else {
				msg = "Lo sentimos, la localización introducida no existe en nuestra base de datos";
				view = "index.jsp";
			}
			
			
			
			
			request.setAttribute("t", t);
			request.setAttribute("localizacion", localizacion);
			request.setAttribute("tipoGrados", tipoGrados);
			request.setAttribute("msg", msg);
			
		}catch(Exception e) {
			e.printStackTrace();
			msg = " Se ha producido un fallo. Pruebe de nuevo por favor.";
		}finally {
			request.getRequestDispatcher(view).forward(request, response);
		}
	}


}

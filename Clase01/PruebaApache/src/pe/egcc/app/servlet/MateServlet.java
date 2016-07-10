package pe.egcc.app.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import pe.egcc.app.service.MateService;

/**
 * Servlet implementation class MateServlet
 */
@WebServlet("/MateServlet")
public class MateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			// DATOS
			int valor = Integer.parseInt(req.getParameter("opera"));
			int n1 = Integer.parseInt(req.getParameter("n1"));
			int n2 = Integer.parseInt(req.getParameter("n2"));
			MateService i = new MateService();
			int resultado;
			String operacion;
			if (valor == 1) {
				operacion = "Suma";
				resultado = i.sumar(n1, n2);
			} else if (valor == 2) {
				operacion = "Multiplicación";
				resultado = i.producto(n1, n2);
			} else {
				operacion = "No hubo";
				resultado = 0;
			}
			PrintWriter out;
			out = resp.getWriter();
			resp.setContentType("text/html");
			out.println("N1 " + n1+"<br>");
			out.println("N2 " + n2+"<br>");
			out.println("Igual " + resultado+"<br>");
			out.println("Operación " + operacion+"<br>");
			// req.setAttribute("Printer", arg1);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

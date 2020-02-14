package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenheitToCelsiusConverter;

/**
 * Servlet implementation class getFahrenheitServlet
 */
@WebServlet("/getFahrenheitServlet")
public class getFahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getFahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String degreesCelsius = request.getParameter("degreesC");
		FahrenheitToCelsiusConverter degreesFahrenheit = new FahrenheitToCelsiusConverter(Double.parseDouble(degreesCelsius), false);
		
		request.setAttribute("showFahrenheit", degreesFahrenheit);
		getServletContext().getRequestDispatcher("/c_to_f_conf.jsp").forward(request, response);
	}

}

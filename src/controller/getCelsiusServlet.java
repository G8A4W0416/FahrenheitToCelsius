package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.FahrenheitToCelsiusConverter;

/**
 * Servlet implementation class getCelsiusServlet
 */
@WebServlet("/getCelsiusServlet")
public class getCelsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getCelsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String degreesFahrenheit = request.getParameter("degreesF");
		FahrenheitToCelsiusConverter degreesCelsius = new FahrenheitToCelsiusConverter(Double.parseDouble(degreesFahrenheit), true);
		
		request.setAttribute("showCelsius", degreesCelsius);
		getServletContext().getRequestDispatcher("/f_to_c_conf.jsp").forward(request, response);
	}

}

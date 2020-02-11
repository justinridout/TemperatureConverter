package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;

/**
 * Servlet implementation class celsiusServlet
 */
@WebServlet("/celsiusServlet")
public class celsiusServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public celsiusServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String celsius = request.getParameter("degreesCelsius");
		
		TemperatureConverter toCelsius = new TemperatureConverter(Double.parseDouble(celsius));
		
		request.setAttribute("userCelsius", toCelsius);
		
		getServletContext().getRequestDispatcher("/resultCelsius.jsp").forward(request,response);
	}

}

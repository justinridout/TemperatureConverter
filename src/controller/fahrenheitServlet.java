package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TemperatureConverter;

/**
 * Servlet implementation class fahrenheitServlet
 */
@WebServlet("/fahrenheitServlet")
public class fahrenheitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public fahrenheitServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fahrenheit = request.getParameter("degreesFahrenheit");
		
		TemperatureConverter toFahrenheit = new TemperatureConverter(Double.parseDouble(fahrenheit));
		
		request.setAttribute("userFahrenheit", toFahrenheit);
		
		getServletContext().getRequestDispatcher("/resultFahrenheit.jsp").forward(request,response);
	}

}

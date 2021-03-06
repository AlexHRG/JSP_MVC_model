

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Validator
 */
@WebServlet("/validator")
public class Validator extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private static Map<String, String> pwdMap = new HashMap();   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Validator() {
        super();
        
        pwdMap.put("admin", "admin1");
    }

    public static Map getMap(){
    	return pwdMap;
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		PrintWriter out = response.getWriter();
		
		if (pwdMap.get(login) != null && pwdMap.get(login).equals(password)){
			out.println("Welcome!");
		} else {
			out.print("login failed!");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

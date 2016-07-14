package Controllers;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.LogManager;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String Username="administrador";
    private String password="admin123";
	static org.apache.log4j.Logger log = LogManager.getLogger(Login.class.getName());
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        log.info("Ejecutando Servlet Login.do");
        String u,p;
        u=request.getParameter("username");
        p=request.getParameter("password");
        log.trace("Valor del Username: "+u);
        log.trace("Valor del Password: "+p);
        if(u.equals("") || p.equals("")){
            log.error("Error campos vacios");
            request.getRequestDispatcher("Error.jsp").forward(request, response);
            //response.sendRedirect("Error.jsp");
        }else if(u.equals(Username) && p.equals(password)){
            log.info("Exito!!!");
            request.getRequestDispatcher("Exito.jsp").forward(request, response);
            //response.sendRedirect("Exito.jsp");
        }else{
            //response.sendRedirect("Error.jsp");
            log.error("Error Usuario y contrasena incorrectos");
            request.getRequestDispatcher("Error.jsp").forward(request, response);
        }
            
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		processRequest(request, response);
	}

}

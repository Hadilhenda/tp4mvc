package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import modele.authen;

/**
 * Servlet implementation class authentification
 */
@WebServlet("/authentification")
public class authentification extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public authentification() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String prenom = request.getParameter( "pren" );
        String nom = request.getParameter( "no" );
		String message = "Bienvenue à votre session";
		authen auth = new authen();
		 request.setAttribute("nom",nom);
	     request.setAttribute("prenom",prenom);
		HttpSession maSession = request.getSession();
		maSession.setAttribute("NP", auth);
		request.setAttribute( "message", message );
		String mes = "nom.jsp";
	    RequestDispatcher dispatcher = request.getRequestDispatcher(mes);
	    dispatcher.forward(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

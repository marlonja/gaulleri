

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Servlet implementation class DoIt
 */
@WebServlet("/DoIt")
public class DoIt extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public ArrayList<String>newsLetter;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DoIt() {
     
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		newsLetter = new ArrayList<String>();
		newsLetter.add("admin@gmail.com");
		newsLetter.add("jakobssonmarlon@gmail.com");
		newsLetter.add("johannesklint@gmail.com");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		for(int i = 0; i < newsLetter.size(); i++){
			out.println(newsLetter.get(i) + ("<br>") ); 
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Got post to doit");
		PrintWriter pw = response.getWriter();
		String userName = request.getParameter("email");
		String lUserName = userName.toLowerCase();
		
		boolean emailFound;
		
	System.out.println(userName);
			if(newsLetter.contains(lUserName)){
				System.out.println("email found");
				pw.print("true");
				
			}else{
				System.out.println("email not found");
				newsLetter.add(lUserName);
				pw.print("false");
				
			}		
		}
	
}

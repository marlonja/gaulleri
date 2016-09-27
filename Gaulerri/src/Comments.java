
import head.CommentObject;

import java.io.IOException;
import java.io.PrintWriter;
//import java.sql.Date;
import java.util.*;
import java.text.*;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import head.CommentObject;

/**
 * Servlet implementation class Comments
 */
@WebServlet("/Comments")
public class Comments extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static ArrayList<CommentObject> comments; 
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Comments() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		comments = new ArrayList<CommentObject>();	

		ServletContext context = config.getServletContext();
		context.setAttribute("comments", comments);
		System.out.println("comments servlet initiated");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("commentsName");
		String content = request.getParameter("commentsText");
		
		CommentObject comObj = new CommentObject(name, content);
		
		ServletContext context = request.getServletContext();
		context.setAttribute("comments", comments);
		  
		comments.add(comObj);
		
	}
	
}

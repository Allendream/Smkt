package storage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;

import servlet.PackingDatabase;

/**
 * Servlet implementation class modifyamount
 */
@WebServlet("/modifyamount")
public class modifyamount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public modifyamount() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productID = request.getParameter("productID");
        System.out.println(productID);
	
		String name = request.getParameter("name");
		String amount =request.getParameter("amount");

		String mySql = "update storage set productID='" + productID + "', name='" + name
				+ "',amount='" + amount + "' where  productID=" + productID;
		PackingDatabase packing = new PackingDatabase();
		try {
			
			packing.update(mySql);
		
		} catch (Exception e) {
			
			System.out.println("ss" + e.getMessage());
		}
		
	}

}

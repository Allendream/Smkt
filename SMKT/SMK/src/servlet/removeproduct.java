package servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.PackingDatabase;
import servlet.DbUtil;



/**
 * Servlet implementation class removeproduct
 */
@WebServlet("/removeproduct")
public class removeproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public removeproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productID =request.getParameter("productID");
		System.out.println(productID);
		
	
		String Sql="delete from goods where productID='"+productID+"'";
		PackingDatabase packing = new PackingDatabase();
		try {
		
			packing.update(Sql);
			System.out.println(Sql);
			response.sendRedirect("goods.html");
		} catch (Exception e) {
		System.out.println(e.getMessage());
		}

	
	/**String productID =request.getParameter("productID");
	System.out.println(productID);
	try {
		
		Connection conn = DbUtil.getConnection();
		PreparedStatement ptmt = conn
				.prepareStatement("delete from goods where productID='"+productID+"'",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		
		
		
		ptmt.executeUpdate();
		
		ptmt.close();
	
		conn.close();
	}	
	
	

	catch (SQLException e) 
	{
	   // TODO Auto-generated catch block
	   e.printStackTrace();
	   System.out.println("找不到数据源！");           
	}
	response.sendRedirect("goods.html");*/
}


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request,response);
		/**
		String productID =request.getParameter("productID");
		System.out.println(productID);
		try {
			
			Connection conn = DbUtil.getConnection();
			PreparedStatement ptmt = conn
					.prepareStatement("delete from goods where productID='"+productID+"'",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			
			
			ptmt.executeUpdate();
			
			ptmt.close();
		
			conn.close();
		}	
		
		

		catch (SQLException e) 
		{
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   System.out.println("找不到数据源！");           
		}
		response.sendRedirect("goods.html");
		
	}*/
	}}

	

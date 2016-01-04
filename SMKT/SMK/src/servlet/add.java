package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class add
 */
@SuppressWarnings("unused")
@WebServlet("/add")
public class add extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public add() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String productID =request.getParameter("productID");
		String productname = request.getParameter("productname");
		int price =Integer.parseInt(request.getParameter("price"));
		String Infor = request.getParameter("information");
	
		
		try {
			
			Connection conn = DbUtil.getConnection();
			PreparedStatement ptmt = conn
					.prepareStatement("insert into goods(productID,productname,price,infor) values(?,?,?,?)",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			ptmt.setString(1,productID);
			ptmt.setString(2, productname);
			ptmt.setInt(3, price);
			ptmt.setString(4, Infor);
			
			ptmt.executeUpdate();
			
			ptmt.close();
			PreparedStatement stmt = conn
					.prepareStatement("INSERT INTO storage (productID,name) VALUES ('"+productID+"','"+productname+"');",ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
			
			
			stmt.executeUpdate();
			conn.close();
		}	
		
		
	
		catch (SQLException e) 
		{
		   // TODO Auto-generated catch block
		   e.printStackTrace();
		   System.out.println("找不到数据源！");           
		}
		response.sendRedirect("goods.html");
	}

	}



package employer;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.json.JSONArray;
import org.json.JSONObject;

import dao.DbUtil;
/**
 * Servlet implementation class Addstaff
 */
@WebServlet("/Addstaff")
public class Addstaff extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addstaff() {
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
		response.setContentType("application/json");  
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
	    String name = request.getParameter("mname");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		String socialID = request.getParameter("socialID");
		double discountlevel=0;
		 PrintWriter out = response.getWriter();
		String password=null;
		 PreparedStatement pstat = null;
		ResultSet rs = null;
		String sql = null;
		JSONArray ja=new JSONArray();
		try{
			Connection conn = DbUtil.getConnection();
			sql = "insert into staff(name,email,phone,password,authority,socialID) values(?,?,?,?,?,?)";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, name);
			pstat.setString(2, email);
			pstat.setString(3, phone);
			pstat.setString(4, "123456");
			pstat.setString(5, "ø‚¥Êπ‹¿Ì‘±");
			pstat.setString(6, socialID);
			pstat.executeUpdate();
			pstat.close();
			conn.close();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		response.sendRedirect("employer.jsp");		 
		
	}
	}
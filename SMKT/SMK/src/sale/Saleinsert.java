package sale;

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
 * Servlet implementation class Saleinsert
 */
@WebServlet("/Saleinsert")
public class Saleinsert extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Saleinsert() {
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
		response.setContentType("application/json");  
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
	  
		String productID = request.getParameter("productID");
		int quantity=Integer.parseInt(request.getParameter("quantity"));
		
		 PrintWriter out = response.getWriter();
		
		 
		 String productname=null,state=null;
		 int price=0,money=0,amount=0;
		
		//out.print(amount);
		
		//out.print(productID);
		
		 PreparedStatement pstat = null;
		ResultSet rs = null;
		String sql = null;
		JSONArray ja=new JSONArray();
		try{
			Connection conn = DbUtil.getConnection();
			
						
			sql = "select * from `goods` where  productID='"+ productID + " '";
			pstat = conn.prepareStatement(sql);
			rs = pstat.executeQuery();
			if (rs.next()) {
				productname= rs.getString("productname").trim();
				price= rs.getInt("price");	
			}
			money=price*quantity;
			
			
			
			sql="update `storage` set amount=amount-" + quantity + "  where productID='"+ productID + "'";
			 pstat = conn.prepareStatement(sql);
			 pstat.executeUpdate();
			 pstat.close();	
			
			
			
		
			sql = "insert into sales(productID,name,quantity,price,money,state) values(?,?,?,?,?,?)";
			pstat = conn.prepareStatement(sql);
			pstat.setString(1, productID);
			pstat.setString(2, productname);
			pstat.setInt(3, price);
			pstat.setInt(4, quantity);
			pstat.setInt(5, money);
			pstat.setString(6, "未完成");
			pstat.executeUpdate();
			pstat.close();
			conn.close();	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		response.sendRedirect("bcash.jsp");		 
		//out.print("alert('添加成功)");
	}
	}
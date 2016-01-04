package member;

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

import org.json.JSONArray;
import org.json.JSONObject;

import dao.DbUtil;

/**
 * Servlet implementation class Member
 */
@WebServlet("/Member")
public class Member extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Member() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("application/json");  
	    response.setCharacterEncoding("UTF-8");
	    response.setContentType("text/html;charset=UTF-8");
	    response.setHeader("Cache-Control", "no-cache");  
			
	    PrintWriter out = response.getWriter();	
	
		
			//String deliver = (String) request.getSession().getAttribute("name");
			
			String mname = null,phone=null,email=null,adress=null,validtime=null;
			int id=0;
			double discountlevel=0;
					PreparedStatement pstat = null;
			ResultSet rs = null;
			String sql = null;
			JSONArray ja=new JSONArray();
			try{
				Connection conn = DbUtil.getConnection();
				sql = "select * from `member`";
				pstat = conn.prepareStatement(sql);
				
				rs = pstat.executeQuery();
			
				
			response.setContentType("text/x-json");
				
				
				while (rs.next())  {
					JSONObject jo=new JSONObject();
					jo.put("id",rs.getInt("id"));
					jo.put("mname",rs.getString("mname"));
					jo.put("phone",rs.getString("phone"));
					jo.put("email",rs.getString("email"));
					jo.put("adress",rs.getString("adress"));
					jo.put("discountlevel",rs.getDouble("discountlevel"));
					jo.put("validtime",rs.getString("validtime"));
					
					ja.put(jo);
				}
			out.print(ja.toString());	
					out.close();
					rs.close();
					pstat.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

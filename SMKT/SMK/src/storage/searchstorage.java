package storage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import servlet.PackingDatabase;

/**
 * Servlet implementation class searchstorage
 */
@WebServlet("/searchstorage")
public class searchstorage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public searchstorage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
  		request.setCharacterEncoding("UTF-8");
		String keyword = request.getParameter("keyword");
		System.out.println(keyword);
		//String number = request.getParameter("number");
		String mySql="select * from storage where productID='"+keyword+"'";
		System.out.println(mySql);
		PackingDatabase packing = new PackingDatabase();
		try {
			ResultSet rs = packing.query(mySql);
			response.setContentType("application/json");  
		    response.setCharacterEncoding("UTF-8");  
			
			PrintWriter out = response.getWriter();
			JSONArray ja = new JSONArray();
			while (rs.next()) {
				JSONObject jo=new JSONObject();
				jo.put("productID",rs.getString("productID"));
				jo.put("name",rs.getString("name"));
				jo.put("amount",rs.getString("amount"));
				jo.put("updatetime",rs.getString("updatetime"));
				ja.put(jo);
			}
			rs.close();
			out.print(ja.toString());
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
			
	}
			//{ "success": true, "rows": [{"id": 1, "name": "zhang"}, {"id": 2, "name": "wang"}, 
			//{"id": 3, "name": "li"}] }
			
			/*
			pw.print("<table>");
			
			while(rs.next()){
				pw.print("<tr>");
				pw.print("<td>" + rs.getInt("RowId") + "</td>");
				pw.print("<td>" + rs.getString("Name") + "</td>");
				pw.print("</tr>");
			}
			
			pw.print("</table>");
			
			*/
			
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}

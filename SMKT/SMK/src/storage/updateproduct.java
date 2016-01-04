package storage;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.PackingDatabase;



import org.json.JSONObject;
/**
 * Servlet implementation class updateproduct
 */
@WebServlet("/updateproduct")
public class updateproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public updateproduct() {
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
		
		String mySql = "select * from storage where productID=" + productID + "";
		System.out.println(mySql);
		
		PackingDatabase packing = new PackingDatabase();
		try {
			// ִ�в�ѯ����
			ResultSet rs = packing.query(mySql);
			// response.setContentType("text/x-json;charset=utf-8");

			PrintWriter out = response.getWriter();

			JSONObject jo = new JSONObject();
			if (rs.next()) {
				jo.put("productID", rs.getString("productID"));
				jo.put("name", rs.getString("name"));
				jo.put("amount", rs.getString("amount"));
				System.out.println(rs);
			}
			rs.close();
			out.print(jo.toString());
			out.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());}
		

	}
	

}

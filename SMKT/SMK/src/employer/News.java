package employer;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;
import org.json.JSONArray;
import org.json.JSONObject;

import dao.DbUtil;

/**
 * Servlet implementation class News
 */
@WebServlet("/News")
public class News extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public News() {
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
		// TODO Auto-generated method stub
		 response.setCharacterEncoding("UTF-8");
		    response.setContentType("text/html;charset=UTF-8");
			PrintWriter out = response.getWriter();

			String id=null;
			String name = request.getParameter("name");
		    String subject=request.getParameter("subject");
			String time=request.getParameter("time");
			String message=request.getParameter("message");
			//Double discountlevel = Double.parseDouble("discountlevel");
			PreparedStatement pstat = null;
				ResultSet rs = null;
				String sql = null;
				//,phone='"+ phone + " ',email='"+ email + " ' ,adress='"+ adress + " ',discountlevel='"+ discountlevel + " '
				
					try{
						Connection conn = DbUtil.getConnection();
						sql = "insert into news(subject,name,message) values(?,?,?)";
						pstat = conn.prepareStatement(sql);
						pstat.setString(1, subject);
						pstat.setString(2, name);
						pstat.setString(3, message);
						
						pstat.executeUpdate();
						pstat.close();
						conn.close();	
						
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}	
		
				response.sendRedirect("indexmanager.jsp");		
		
		}

	}
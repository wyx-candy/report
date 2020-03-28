package report;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		/**
         * 接收前台传来的值 账号和密码
         */
		String userName=req.getParameter("userName");
		String password=req.getParameter("password");
		DbUtil db= new DbUtil();
		user user=new user(userName,password);
		Dao dao=new Dao();
		try{
			//数据库链接
            Connection con=db.getCon();
            
            if(dao.register(con,user)){
            	resp.sendRedirect("login.jsp");
            }else{
            	resp.sendRedirect("register.jsp");
            }
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

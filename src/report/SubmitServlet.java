package report;

import java.io.IOException;
import java.sql.Connection;
import java.text.ParseException;
//import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SubmitServlet")
public class SubmitServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		this.doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
		/**
         * 提交用户信息
         */
		int id=req.getIntHeader("id");
		String name=req.getParameter("name");
		String zhiye=req.getParameter("zhiye");
		String sex=req.getParameter("sex");
		String college=req.getParameter("college");
		String hubei=req.getParameter("hubei");
		String wuhan=req.getParameter("wuhan");
		person person=new person(id,name,zhiye,sex,college,hubei,wuhan);
		
		String contact=req.getParameter("contact");
		String confirm=req.getParameter("confirm");
		String date1=req.getParameter("date");
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		ill ill=null;
		try {
			date = simpleDateFormat.parse(date1);
			ill=new ill(id,contact,confirm,date);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		DbUtil db= new DbUtil();
		Dao dao=new Dao();
		try{
			//数据库链接
            Connection con=db.getCon();
            
            if(dao.submit(con,ill)){
            	resp.sendRedirect("login.jsp");
            }else{
            	resp.sendRedirect("register.jsp");
            }
		}catch (Exception e){
			e.printStackTrace();
		}
	}
}

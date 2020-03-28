package report;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;import java.util.ArrayList;
import java.util.List;

public class Dao {
	/**
     * login(Connection con,User user) 登录验证
     * (Connection con,User user)注册功能
     */
	//登录功能
	public user login(Connection con,user user) throws Exception{
		user resultUser=null;
		String sql="select * from t_user where userName=? and password=?";
		PreparedStatement pstmt=con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		ResultSet rs=pstmt.executeQuery();
		if(rs.next()){
			resultUser=new user();
			resultUser.setUserName(rs.getString("userName"));
			resultUser.setPassword(rs.getString("password"));
		}
		
		return resultUser;
	}
	
	//注册功能
	public boolean register(Connection con,user user) throws Exception{
		boolean flag=false;
		PreparedStatement pstmt = null;
		String sql="INSERT INTO t_user(userName,password)VALUES(?,?)";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, user.getUserName());
		pstmt.setString(2, user.getPassword());
		
		if (pstmt.executeUpdate() > 0){
			flag = true;
		}
		
		return flag;
	}
	
	//提交功能
		public boolean submit(Connection con,person person) throws Exception{
			boolean flag=false;
			PreparedStatement pstmt = null;
			String sql="INSERT INTO person(id,name,zhiye,sex,college,hubei,wuhan)VALUES(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, person.getId());
			pstmt.setString(2, person.getName());
			pstmt.setString(1, person.getZhiye());
			pstmt.setString(2, person.getSex());
			pstmt.setString(1, person.getCollege());
			pstmt.setString(2, person.getHubei());
			pstmt.setString(2, person.getWuhan());
			
			if (pstmt.executeUpdate() > 0){
				flag = true;
			}
			
			return flag;
		}		
		public boolean submit(Connection con,ill ill) throws Exception{
			boolean flag=false;
			PreparedStatement pstmt = null;
			String sql="INSERT INTO illness(id,contact,confirm,date)VALUES(?,?)";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, ill.getId());
			pstmt.setString(2, ill.getContact());
			pstmt.setString(1, ill.getConfirm());
			pstmt.setDate(2, (java.sql.Date) ill.getDate());
			
			if (pstmt.executeUpdate() > 0){
				flag = true;
			}
			
			return flag;
		}
	
	//普通用户显示 信息
	public List<ill> readIll() throws Exception{
		List<ill> list =new ArrayList<ill>();
		DbUtil db= new DbUtil();
		ResultSet rs=null;
		Connection con=db.getCon();
		String sql="select * from illness";
		PreparedStatement pstmt=null;
		
        pstmt=con.prepareStatement(sql);
        rs=pstmt.executeQuery();
           
        while(rs.next())
        {
        	int id=rs.getInt("id");
            String contact=rs.getString("contact");
            String confirm=rs.getString("confirm");
            Date date=rs.getDate("date");
            ill tl=new ill(id, contact, confirm, date);
            list.add(tl);
        }
        return list;
	}
	
}

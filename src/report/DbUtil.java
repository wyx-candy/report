package report;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbUtil {
	//@DbUtil类作用jdbc的简单配置
	
	private String dbUrl="jdbc:mysql://localhost:3306/report2"
			+ "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	
	private String dbUserName="root";
	private String dbPassword="wyx40223";
	
	private String jdbcName="com.mysql.jdbc.Driver";
	
	/**
     * 获取数据库连接
     * @return
     * @throws Exception
     */
	public Connection getCon() throws Exception{
		Class.forName(jdbcName);
		Connection con=DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
		return con;
	}
	
	/**
     * 关闭数据库连接
     * @param con
     * @throws Exception
     */
	public void closeCon(Connection con) throws Exception{
		 if(con!=null){
	            con.close();
	        }
	}
	
	/**
     * 建立一个main方法测试是否可以连接数据库成功！
     * @param args
     */
	public static void main(String[] args){
		DbUtil dbUtil=new DbUtil();
		try{
			dbUtil.getCon();
			System.out.println("数据库连接成功");
		}catch(Exception e){
			//TODO Auto-generated cath block
			e.printStackTrace();
		}
	}	
}

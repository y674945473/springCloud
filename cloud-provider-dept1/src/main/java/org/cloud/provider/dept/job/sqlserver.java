package org.cloud.provider.dept.job;

import java.sql.Connection;
import java.sql.DriverManager;

public class sqlserver {

	public static void main(String[] args) {
		String driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
		//加载JDBC驱动
		String dbURL = "jdbc:sqlserver://192.168.0.150:1400; DatabaseName=SAS_LY"; 
		//连接服务器和数据库
		String userName = "sa"; //默认用户名
		String userPwd = "Sas123456!"; //密码
		Connection dbConn;
		try {
		   Class.forName(driverName);
		   dbConn = DriverManager.getConnection(dbURL, userName, userPwd);
		   System.out.println("Connection Successful!"); 
		     //如果连接成功 控制台输出Connection  Successful!
		} catch (Exception e) {
		   e.printStackTrace();
		}
	}
}

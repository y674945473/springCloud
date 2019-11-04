package org.cloud.provider.dept.job;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysql {

	public static void main(String[] args) {
		String driverName = "org.gjt.mm.mysql.Driver"; 
		//加载JDBC驱动
		String dbURL = "jdbc:mysql://47.104.68.210:3306/mysql"; 
		//连接服务器和数据库
		String userName = "root"; //默认用户名
		String userPwd = "1qa@WS#ED"; //密码
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

package jp.co.naga.db;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

import jp.co.naga.common.PropUtil;

public class dbUtil {

	public static void main(String[] args){
		PropUtil.setProp("naga");

		String test = PropUtil.getPropVal("test");

		System.out.println(test);
	}

	public static void dbconnect(){
		Connection conn = null;
		String url = "jdbc:mysql://localhost/jdbctestdb";
		String user = "testuser";
		String password = "testpass";

		try{
			conn = (Connection) DriverManager.getConnection(url, user, password);

			// データベースに対する処理

		}catch (SQLException e){
		}
	}
}

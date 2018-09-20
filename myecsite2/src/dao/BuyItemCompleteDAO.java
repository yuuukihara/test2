package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import util.DBConnector;
import util.DateUtil;

public class BuyItemCompleteDAO {
	DBConnector db = new DBConnector();
	Connection con = db.getConnection();
	DateUtil du = new DateUtil();

	String sql = "insert into ubit(itid,tprice,tcount,umid,pay,insert_date)VALUES(?,?,?,?,?,?)";

	public void buyItemInfo(String iid,String tprice,String tcount,String umid,String pay)throws SQLException{
		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, iid);
			ps.setString(2, tprice);
			ps.setString(3, tcount);
			ps.setString(4, umid);
			ps.setString(5, pay);
			ps.setString(6, du.getDate());

			ps.execute();
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}

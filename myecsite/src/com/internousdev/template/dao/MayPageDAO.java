package com.internousdev.template.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.internousdev.template.dto.MyPageDTO;
import com.internousdev.template.util.DBConnector;

public class MayPageDAO {

	public MyPageDTO getMyPageUserInfo(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();
		MyPageDTO mpd = new MyPageDTO();

		String sql ="select iit.item_name,ubit.total_price,ubit.total_count,ubit.pay from user_buy_transaction ubit LEFT JOIN item_info_transaction iit ON ubit.item_transaction_id = iit.id where ubit.item_transaction_id = ? and ubit.user_master_id = ? order by ubit.insert_date DESC";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				mpd.setItemName(rs.getString("item_name"));
				mpd.setTotalPrice(rs.getString("total_price"));
				mpd.setTotalCount(rs.getString("total_count"));
				mpd.setPayment(rs.getString("pay"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return mpd;
	}
	public int buyItemHistoryDelete(String item_transaction_id,String user_master_id)throws SQLException{
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="DELETE from user_buy_transaction where item_transaction_id = ? and user_master_id = ?";
		PreparedStatement ps;
		int result = 0;

		try{
			ps = con.prepareStatement(sql);
			ps.setString(1, item_transaction_id);
			ps.setString(2, user_master_id);

			result = ps.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}

}

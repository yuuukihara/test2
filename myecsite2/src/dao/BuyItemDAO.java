package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import dto.BuyItemDTO;
import util.DBConnector;

public class BuyItemDAO {
	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private BuyItemDTO biDTO = new BuyItemDTO();

	public BuyItemDTO getBuyItemInfo(){
		String sql = "select id,iname,iprice from iit";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			if(rs.next()){
				biDTO.setId(rs.getInt("id"));
				biDTO.setItemName(rs.getString("iname"));
				biDTO.setItemPrice(rs.getString("iprice"));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return biDTO;
	}

	public BuyItemDTO getBuyItemDTO(){
		return biDTO;
	}

}

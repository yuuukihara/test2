package com.internousdev.template.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.template.dao.MayPageDAO;
import com.internousdev.template.dto.MyPageDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MyPageAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;
	public String deleteFlg;
	public String result;

	public String execute()throws SQLException{
		MayPageDAO mpDAO = new MayPageDAO();
		MyPageDTO mpDTO = new MyPageDTO();

		if(deleteFlg == null){
			String item_transaction_id = session.get("id").toString();
			String user_master_id = session.get("login_user_id").toString();

			mpDTO = mpDAO.getMyPageUserInfo(item_transaction_id, user_master_id);

			session.put("buyItem_name",mpDTO.getItemName());
			session.put("total_price",mpDTO.getTotalPrice());
			session.put("total_count", mpDTO.getTotalCount());
			session.put("total_payment", mpDTO.getPayment());
			session.put("message", "");
		}else if(deleteFlg.equals("1")){
			delete();
		}
		result = SUCCESS;
		return result;
	}
	public void delete() throws SQLException{
		MayPageDAO mpDAO = new MayPageDAO();

		String item_transaction_id = session.get("id").toString();
		String user_master_id = session.get("login_user_id").toString();

		int res = mpDAO.buyItemHistoryDelete(item_transaction_id, user_master_id);
		if(res>0){
			session.put("message", "商品を消去しました");
		}else if(res == 0){
			session.put("message", "商品の消去に失敗");
		}
	}
	public String getDeleteFlg(){
		return deleteFlg;
	}
	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}
	@Override
	public void setSession(Map<String,Object> loginSessionMap){
		this.session = loginSessionMap;
	}

}

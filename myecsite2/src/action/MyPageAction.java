package action;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.MyPageDAO;
import dto.MyPageDTO;

public class MyPageAction extends ActionSupport implements SessionAware{
	Map<String,Object> session;
	MyPageDAO dao = new MyPageDAO();
	ArrayList<MyPageDTO> mplist = new ArrayList<MyPageDTO>();
	String deleteFlg;
	String message;

	public String execute() throws SQLException{
		if(!session.containsKey("id")){
			return ERROR;
		}
		if(deleteFlg == null){
			String iti = session.get("id").toString();
			String umi = session.get("login_User_id").toString();
			mplist = dao.getMyPageUserInfo(iti,umi);
		}else if(deleteFlg.equals("1")){
			delete();
		}
		String result="SUCCESS";
		return result;
	}

	public void delete() throws SQLException{
		String iti = session.get("id").toString();
		String umi = session.get("login_user_id").toString();

		int res = dao.buyItemHistoryDelete(iti,umi);
		if(res>0){
			mplist = null;
			setMessage("商品情報を正しく消去できました");
		}else if(res == 0){
			setMessage("商品情報消去に失敗しました");
		}
	}

	public void setDeleteFlg(String deleteFlg){
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

	public ArrayList<MyPageDTO> getMyPageList(){
		return this.mplist;
	}
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

}
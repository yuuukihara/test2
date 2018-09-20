package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.BuyItemDAO;
import dao.LoginDAO;
import dto.BuyItemDTO;
import dto.LoginDTO;

public class LoginAction extends ActionSupport implements SessionAware{

	private String loginId;
	private String loginPass;
	private Map<String,Object> session;
	LoginDAO ldao = new LoginDAO();
	LoginDTO ldto = new LoginDTO();
	BuyItemDAO bidao = new BuyItemDAO();

	public String execute(){
		String result = ERROR;
		ldto = ldao.getLoginUserInfo(loginId,loginPass);
		session.put("login_user", ldto);
		if(((LoginDTO)session.get("login_user")).getLoginFlg()){
			result = SUCCESS;
			BuyItemDTO bidto = bidao.getBuyItemInfo();
			session.put("login_id", ldto.getLoginId());
			session.put("id", bidto.getId());
			session.put("buyItem_name", bidto.getItemName());
			session.put("buyItem_price", bidto.getItemPrice());
			return result;
		}
		return result;
	}

	public String getLoginId(){
		return loginId;
	}
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginPass(){
		return loginPass;
	}
	public void setLoginPass(String loginPass){
		this.loginPass = loginPass;
	}
	public Map<String,Object> getSession(){
		return session;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}



}

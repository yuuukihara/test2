package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.BuyItemDAO;
import dto.BuyItemDTO;

public class HomeAction extends ActionSupport implements SessionAware{
	public Map<String,Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("id")){
			BuyItemDAO biDAO = new BuyItemDAO();
			BuyItemDTO biDTO = biDAO.getBuyItemInfo();
			session.put("id", biDTO.getId());
			session.put("buyItem_name", biDTO.getItemName());
			session.put("buyItem_price", biDTO.getItemPrice());
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public Map<String,Object> getSession(){
		return session;
	}

}

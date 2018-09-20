package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.BuyItemDAO;
import dto.BuyItemDTO;

public class HomeAction extends ActionSupport implements SessionAware{

	Map<String,Object> session;

	public String execute(){
		String result = "login";
		if(session.containsKey("id")){
			BuyItemDAO bidao = new BuyItemDAO();
			BuyItemDTO bidto = bidao.getBuyItemInfo();
			session.put("id", bidto.getId());
			session.put("buyItem_name", bidto.getItemName());
			session.put("buyItem_price",bidto.getItemPrice());
			result = SUCCESS;
		}
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}

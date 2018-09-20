package action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class UserCreateConfirmAction extends ActionSupport implements SessionAware{
	private String loginUserName;
	private String loginUserPassword;
	private String loginUserId;
	public Map<String,Object> session;
	private String errorMassage;

	public String execute(){

		String result = SUCCESS;
		if(!(loginUserId.equals(""))
			&& !(loginUserPassword.equals(""))
			&& !(loginUserName.equals(""))){
			session.put("loginUserName", loginUserName);
			session.put("loginUserPassword", loginUserPassword);
			session.put("loginUserId", loginUserId);
		}else{
			setErrorMassage("未入力の項目があります");
			result = ERROR;
		}
		return result;
	}

	public String getLoginUserName(){
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName){
		this.loginUserName = loginUserName;
	}
	public String getLoginUserPassword(){
		return loginUserPassword;
	}

	public void setLoginUserPassword(String loginUserPassword){
		this.loginUserPassword = loginUserPassword;
	}

	public String getLoginUserId(){
		return loginUserId;
	}

	public void setLoginUserId(String loginUserId){
		this.loginUserId = loginUserId;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}
	public String getErrorMassage(){
		return errorMassage;
	}
	public void setErrorMassage(String errorMassage){
		this.errorMassage = errorMassage;
	}

}

package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	private String loginUserId;
	private String loginUserName;
	private String loginUserPassword;
	public Map<String,Object> session;
	private UserCreateCompleteDAO uccdao = new UserCreateCompleteDAO();

	public String execute() throws SQLException{
		uccdao.createUser(session.get("loginUserId").toString(),
				session.get("loginUserPassword").toString(),
				session.get("loginUserName").toString()
				);
		String result = SUCCESS;
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

}
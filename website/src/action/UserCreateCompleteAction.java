package action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

import dao.UserCreateCompleteDAO;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware{

	public Map<String,Object> session;
	private UserCreateCompleteDAO uccdao = new UserCreateCompleteDAO();

	public String execute()throws SQLException{
		uccdao.createUser(session.get("loginId").toString(),
				session.get("loginPass").toString(),
						session.get("loginUserName").toString());
		String result = SUCCESS;
		return result;

	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}

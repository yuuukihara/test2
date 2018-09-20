package dto;

public class LoginDTO {
	private int id;
	private String loginId;
	private String loginPass;
	private String loginUserName;
	private boolean loginFlg = false;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
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
	public String getLoginUserName(){
		return loginUserName;
	}
	public void setLoginUserName(String loginUserName){
		this.loginUserName = loginUserName;
	}
	public boolean getLoginFlg(){
		return loginFlg;
	}
	public void setLoginFlg(boolean loginFlg){
		this.loginFlg = loginFlg;
	}
}

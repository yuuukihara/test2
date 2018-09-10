package com.internousdev.ecsite.dto;

public class LoginDTO{

private String loginId;
private String loginPassword;
private String userName;
private String loginUserInfo;
private String buyItemInfo;
private boolean loginFlg = false;
public String getLoginId() {
return loginId;

}
public void setLoginId(String loginId) {
this.loginId = loginId;

}
public String getLoginPassword() {

return loginPassword;

}
public void setLoginPassword(String loginPassword) {

this.loginPassword = loginPassword;

}
public String getUserName() {

return userName;

}
public void setUserName(String userName) {

this.userName = userName;

}
public boolean getLoginFlg() {

return loginFlg;

}
public void setLoginFlg(boolean loginFlg) {

this.loginFlg = loginFlg;

}
public String getLoginUserInfo() {

return loginUserInfo;

}
public void setLoginUserInfo(String LoginUserInfo) {

this.loginUserInfo = LoginUserInfo;

}
public String getBuyItemInfo() {
	return buyItemInfo;

}
public void setBuyItemInfo(String buyiteminfo) {

this.buyItemInfo = buyiteminfo;

}

}
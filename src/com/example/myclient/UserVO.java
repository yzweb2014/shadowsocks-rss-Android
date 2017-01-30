package com.example.myclient;

public class UserVO 
{
	private String userID;
	private String username;
	private String pwd;
	private String port;
	private String Md;
	private String protocol;
	private String obfs;
	private String protocol_param;
	private String obfs_param;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public void setPort(String a) {
		// TODO Auto-generated method stub
		this.port=a;
	}
	public String getPort() {
		return port;
	}
	public void setMd(String c) {
		// TODO Auto-generated method stub
		this.Md=c;
	}
	public String getMd(){
		return Md;
	}
	public void setProtocol(String d){
		this.protocol=d;
	}
	public void setobfs(String e){
		this.obfs=e;
	}
	public String getobfs(){
		return obfs;
	}
	public String getProtocol(){
		return protocol;
	}
	public void setprotocol_param(String f) {
		// TODO Auto-generated method stub
		this.protocol_param=f;
	}
	public String getprotocol_param(){
		return protocol_param;
	}
	public void setobfs_param(String g) {
		// TODO Auto-generated method stub
		this.obfs_param=g;
	}
	public String getobfs_param(){
		return obfs_param;
	}
}

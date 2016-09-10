package com.niotong;

public class Server  {
	private Callback cal;
	Server(Callback cal){
		this.cal = cal;
	}
	public void recive(){
		callback("wo yao lai shou jian lliao\n");
	}
	public void callback(String a){
		cal.callback(a);
	}
}

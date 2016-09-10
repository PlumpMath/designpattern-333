package com.niotong;

public class Client implements Callback{

	//持有快递公司的引用
	public Server ser = new Server(Client.this);
	//我寄件
	public void send(){
		System.out.print("wo shi ke hu ,wo yao ji jian!\n");
		ser.recive(); //将会回调
	}
	//回调函数
	@Override
	public void callback(String mesg) {
		// TODO Auto-generated method stub
		System.out.print("jie dao kuai di lai de dian hua "+ mesg+"\n");
	}

}

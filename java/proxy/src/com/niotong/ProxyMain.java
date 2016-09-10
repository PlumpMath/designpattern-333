package com.niotong;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cli = new Client();
		Server ser = new Server(cli);		//让服务端代理
		ser.eat();
		ser.shit();
		ser.sleep();
		ClientAbstract cliabs = new ClientAbstract();
		ServiceAbstract serabs = new ServerAbstract(cliabs);
		serabs.eat();
		serabs.shit();
		serabs.sleep();
		return;
	}

}

package com.niotong;

public class ProxyMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Client cli = new Client();
		Server ser = new Server(cli);
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

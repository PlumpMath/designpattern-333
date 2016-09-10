package com.niotong;

public class Server implements Service{
	private Client cli;
	Server(Client cli){
		this.cli = cli;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		//回调客户端
		cli.eat();
	}

	@Override
	public void shit() {
		// TODO Auto-generated method stub
		cli.shit();
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		cli.sleep();
	}

}

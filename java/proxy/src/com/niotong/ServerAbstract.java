package com.niotong;

public class ServerAbstract extends ServiceAbstract{
	private ClientAbstract cli;
	public ServerAbstract(ClientAbstract cli) {
		// TODO Auto-generated constructor stub
		this.cli = cli;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
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

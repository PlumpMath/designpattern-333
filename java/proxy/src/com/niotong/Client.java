package com.niotong;
//实现需要代理的内容
public class Client implements Service{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.print("client eat \n");
	}

	@Override
	public void shit() {
		// TODO Auto-generated method stub
		System.out.print("client shit \n");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.print("client sleep \n");
	}

}

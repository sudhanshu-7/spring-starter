package com.sudhanshu.learnspringframework.game;

import org.springframework.stereotype.Component;

@Component
public class PackmanGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("Packman fly!");
	}

	@Override
	public void down() {
		// TODO Auto-generated method stub
		System.out.println("Packman duck!");		
	}

	@Override
	public void left() {
		// TODO Auto-generated method stub
		System.out.println("Packman fast!");		
	}

	@Override
	public void right() {
		// TODO Auto-generated method stub
		System.out.println("Packman slow!");		
	}

}

package com.cg.inheritance;

public class Level2 extends Level{
	void mul(int a,int b) {
		int c=a*b;
		System.out.println("mul:"+c);
	}

	public static void main(String[] args) {
		Level2 l=new Level2();
		l.add(5, 7);
		l.mul(5, 9);
		l.sub(0, 9);
		

	}

}
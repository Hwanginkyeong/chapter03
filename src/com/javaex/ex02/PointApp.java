package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(2,3);
		Point p01 = new Point(2,3);
		Point p02 = new Point(5,9);
		
		Point p04 = p02;  //새로운 공간을 만들어 주는 게 아니라 같은 주소로 만들어준거라 
		
		System.out.println("#getClass()");
		System.out.println(p00.getClass());
		System.out.println(p01.getClass());
		System.out.println(p02.getClass());
		System.out.println("=========================");
		
		System.out.println("#hashCode()");
		System.out.println(p00.hashCode());  //세 개의 값이 같지만 않으면 됨 
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		System.out.println("=========================");
		
		System.out.println("#toString()");
		System.out.println(p00.toString());
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		System.out.println("========================");
		
		System.out.println("#equals()");
		System.out.println(p00.equals(p02));
		System.out.println(p01.equals(p02));
		System.out.println(p01.equals(p00));
		System.out.println(p02==p04);  //주소가 같니?에 대한 대답 
		
		
		
		
		
		
	}

}

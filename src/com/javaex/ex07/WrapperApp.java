package com.javaex.ex07;

public class WrapperApp {

	public static void main(String[] args) {
		
		
		
		//문자열 --> int
		/*
		Integer i05 = 10;
		int r01 = i05.parseInt("12345"); //문자열이 끼어있으면 오류남 
		System.out.println(r01);
		*/
		
		int r01 = Integer.parseInt("12345"); //static을 쓰는 좋은 예 
		System.out.println(r01);
		
		//int --> 문자열 
		/*
		String a = "안녕하세요";
		String snum = a.valueOf(555);
		System.out.println(snum);
		*/
		String snum = String.valueOf(555);
		System.out.println(snum);
		
		String r100 = ""+555; //실제로 개발자들이 이렇게 많이 씀 
		System.out.println(r100);
		
	}

}

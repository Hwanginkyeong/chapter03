package com.javaex.ex06;

public class StringApp001 {
	
	public static void main(String[] args) {
		
		String str01 = new String("hi");
		String str02 = new String("hi");
		
		System.out.println(str01 == str02); //결과값 false 주소값이 같냐? 
		
		System.out.println(str01.hashCode());
		System.out.println(str02.hashCode());
		
		System.out.println("===========================");
		
		String str03 = "hello";
		String str04 = "hello";
		
		
		
		
	}

}

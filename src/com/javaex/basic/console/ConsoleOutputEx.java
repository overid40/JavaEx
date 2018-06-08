package com.javaex.basic.console;

public class ConsoleOutputEx {

	public static void main(String[] args) {
		// System.out.print : 개행 안함
		// System.out.println : 개행 함
		// System.out.printf : 나중에 배움
		
		System.out.print("Hello ");
		System.out.println("Java");
		
		String str1 = "Hello";
		String str2 = "Java";
		
		System.out.println(str1 + " " + str2); //String + 기본타입(문자열로 바뀜). 모든 클래스는 Object.toString()이 포함되어 있어 프린트엘엔에서 문자출력 가능
		
		// 이스케이프 문자
		System.out.println("Hello\nJava");  // 강제 개행
		System.out.println("Hello\tJava"); // 탭문자
		System.out.println("Hello, \"Java\""); // "
		System.out.println("\\ 역슬래시"); //\\
		
		String dir = "D:\\javastudy\\eclipse";

	}

}

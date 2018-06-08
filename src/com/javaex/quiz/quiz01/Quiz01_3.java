package com.javaex.quiz.quiz01;

public class Quiz01_3 {
	public static void main(String[] args) {
		System.out.println("1" + "3");
		System.out.println(true + "Java"); //문자열 + 연산은 문자열로 변환됨
		System.out.println('A' + 'B'); //코드값이 수치로 변환되어 합산되어 나옴
		System.out.println('1' + 2); //코드값과 정수형이 합산되어 나옴
		System.out.println('J' + "ava"); //문자열 + 연산은 문자열로 변환됨
//		System.out.println(false + null); // 변수가 선언되어 있지 않았거나 ""이 없음. null은 연산을 할 수 없음
	}

}

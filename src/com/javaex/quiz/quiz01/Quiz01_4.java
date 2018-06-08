package com.javaex.quiz.quiz01;

public class Quiz01_4 {
	public static void main(String[] args) {
		byte b = 10;
		char ch = 'A';
		int i = 100;
		long l = 1000L;
		
		byte b2 = (byte)i;
		char ch2 = (char)b; // 명시적 형변환 필요함 사인드 언사인드
		short s = (short)ch; // 명시적 형변환 필요함 사인드 언사인드
		float f = (float)l; // 명시적 형변환 필요없음
		int i2 = (int)ch; // 명시적 형변환 필요없음
	}

}

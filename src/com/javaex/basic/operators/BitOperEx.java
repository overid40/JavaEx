package com.javaex.basic.operators;

public class BitOperEx {
	public static void main(String[] args) {
		// 비트 연산
		// 하드웨어 제어, 이미지 프로세싱
		// 미세한 단위 데이터 제어에 사용
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		int result = b1 & b2; // bit and 연산. byte 연산은 int로 변환해서 연산함
		System.out.println(Integer.toBinaryString(result)); //기본형을 래퍼클래스로 감쌈
		
		result = b1 | b2; // bit or 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = b1 ^ b2; // bit xor 연산
		System.out.println(Integer.toBinaryString(result));
		
		result = ~b1; // bit not 연산
		System.out.println(Integer.toBinaryString(result));
		
		
		
	}
}

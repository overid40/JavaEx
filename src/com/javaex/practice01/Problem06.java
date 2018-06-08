package com.javaex.practice01;

import java.util.Scanner;

public class Problem06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요:");
		
		int num = scanner.nextInt();
		
		int startNum = (num % 2 == 0) ? 2:1;
		int sum = 0;
		
		for (int i = startNum; i <= num; i += 2) {
			sum += i;
		
		}
		
		System.out.println("결과: " + sum);
		scanner.close();
//		int sum = 0;
//		
//		if (num % 2 == 0) {
//			for (int i = 0; i <= num; i++) {
//				if(i % 2 != 0) {
//					continue;
//				} else {
//					sum += i;
//				}
//					
//			}
//		} else {
//			for (int i = 0; i <= num; i++) {
//				if(i % 2 == 0) {
//					continue;
//				} else {
//					sum += i;
//				}
//		}
//						
//	}
//		System.out.println(sum);
//		scanner.close();
}
}
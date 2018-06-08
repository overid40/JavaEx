package com.javaex.practice01;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] nums = new int[5];
		
		System.out.println("숫자를 입력하세요.");
		
		for(int i = 0; i <= 4; i++) {
			System.out.println("숫자:");
			int num = scanner.nextInt();
		   for(int j = 1; j <=5; j++) {
			   nums[j] = num;
			   if(nums[j-1] < nums[j]) {
					System.out.println("최대값은" + nums[j+1] + "입니다.");
		   }
		}
		
	}

}
}
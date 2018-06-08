package com.javaex.basic.var;

public class ConstantEx {
	
	static final double PI = 3/14159; // final double 변경불가 변수임
	static final int SPEED_LIMIT = 110;
	
	public static void main(String[] args) {
		System.out.println(PI);
		System.out.println(SPEED_LIMIT); // 메모리 적재를 위해 클래스 생성을 해야한다. 그래서 값을  참조하거나 실행할 수 있는 것을 정적 변수, 정적 메소드 static이 있어야 메모리 상에 올라간다 static이 없다면 변경 불가 변수일 뿐이다
		
		// 상수 변경 시도 
//		 SPEED_LIMIT = 120;
		 // final이어서 변경은 불가함
	}

}

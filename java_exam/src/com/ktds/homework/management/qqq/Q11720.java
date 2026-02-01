package com.ktds.homework.management.qqq;
//Integer.parseInt: 문자열로 된 숫자(예: "123")를 실제 계산이 가능한 정수(int)로 바꿔줍니다.
//N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
import java.util.Scanner;

public class Q11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		String nums = sc.next();
		
		int sum = 0;
		for(int i =0; i<n; i++) {

			sum += Integer.parseInt(nums.charAt(i)+"");
		}
		
		System.out.println(sum);
	}
}
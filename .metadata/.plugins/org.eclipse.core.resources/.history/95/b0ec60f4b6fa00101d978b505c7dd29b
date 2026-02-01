package com.ktds.homework.management.qqq;
//상수는 수학을 정말 못한다
//상수는 수를 다른 사람과 다르게 거꾸로 읽는다
//734와 893을 칠판에 적었다면, 상수는 이 수를 437과 398로 읽는다
//상수는 두 수중 큰 수인 437을 큰 수라고 말할 것이다.
//입력받은2개를 공백을 기준으로 저장하고 저장할 변수 만들고 첫번째ㅣ랑 두번째를 변수에 할당을해주고 
//상수는 뒤에서부터 본다고했으니까 인덱스2번부터 비교를하고ㅓ 더 큰 숫자를 저장공간 ans에 str2 저장을 하고 아니면 str1을 저장한다

import java.util.Scanner;
public class Q2908 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String[] nums = str.split(" ");
	    String ans = "";
	    
	    String str1 = nums[0];
	    String str2 = nums[1];
	    for (int i = 2; i >= 0; i--) {
	        if (str1.charAt(i) < str2.charAt(i)) {
	            ans = str2;
	            break;
	        } else if (str1.charAt(i) > str2.charAt(i)) {
	            ans = str1;
	            break;
	        }
	    }
	    
	    for (int i = 2; i >= 0; i--) {
	        System.out.print(ans.charAt(i));
	    }
	    
	}
	
}

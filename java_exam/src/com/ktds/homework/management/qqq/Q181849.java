package com.ktds.homework.management.qqq;
//한 자리 정수로 이루어진 문자열 num_str이 주어질 때, 각 자리수의 합을 return하도록 solution 함수를 완성해주세요.
//문자열의 길이만큼 반복
//charAt(i)로 한글자씩 가져온뒤 변환 후 더하기
public class Q181849 {
	public static int solution(String num_str) {
        int result = 0;


        for (int i = 0; i < num_str.length(); i++) {

        	result += Integer.parseInt(num_str.charAt(i) + "");
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("123456789")); 
        System.out.println(solution("1000000"));  
    }
}

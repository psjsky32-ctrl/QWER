package com.ktds.homework.management.qqq;
//정수로 이루어진 문자열 n_str이 주어질 때, n_str의 가장 왼쪽에 처음으로 등장하는 0들을 뗀 문자열을 return하도록 solution 함수를 완성해주세요.
//Integer.parseInt로 문자열을 숫자로 변환
public class Q181847 {
	public class Solution {
	    public static String solution(String n_str) {
	       
	        return Integer.parseInt(n_str) + "";
	    }

	    public static void main(String[] args) {
	        System.out.println(solution("0010"));   
	        System.out.println(solution("854020")); 
	    }
	}
}

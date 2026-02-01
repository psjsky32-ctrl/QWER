package com.ktds.homework.management.qqq;
//split: 구분자(기준 문자열)를 기준으로 전체 문자열을 잘라 배열로 반환합니다.
public class Q1152 {

	public static void main(String[] args) {
		
		String s = "The last character is a blank";
		String[] a = s.split(" ");
		
		System.out.println(a.length);
	}
	
}

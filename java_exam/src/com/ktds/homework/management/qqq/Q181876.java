package com.ktds.homework.management.qqq;
//알파벳으로 이루어진 문자열 myString이 주어집니다. 모든 알파벳을 소문자로 변환하여 return 하는 solution 함수를 완성해 주세요.
// toLowerCase() 모든 문자를 소문자로 변환하여 반환
public class Q181876 {
	public static String solution(String myString) {
        return myString.toLowerCase();
    }

    public static void main(String[] args) {
        System.out.println(solution("aBcDeFg"));
        System.out.println(solution("aaa"));    
    }
}

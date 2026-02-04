package com.ktds.homework.management.qqq;
//알파벳으로 이루어진 문자열 myString과 pat이 주어집니다. myString의 연속된 부분 문자열 중 pat이 존재하면 1을 그렇지 않으면 0을 return 하는 solution 함수를 완성해 주세요.알파벳 대문자와 소문자는 구분하지 않습니다
//비교를 위해 둘다 소문자로 바꾼다
//바꾸고 myString에 pat이 포함되어잇는지
public class Q181878 {
	public static int solution(String myString, String pat) {
		
        String lowerMyString = myString.toLowerCase();
        String lowerPat = pat.toLowerCase();
        
        if (lowerMyString.contains(lowerPat)) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        // 테스트 케이스
        System.out.println(solution("AbCdEfG", "aBc"));
        System.out.println(solution("aaAA", "aaaaa")); 
    }
}

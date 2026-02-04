package com.ktds.homework.management.qqq;
//문자열 my_string과 target이 매개변수로 주어질 때, target이 문자열 my_string의 부분 문자열이라면 1을, 아니라면 0을 return 하는 solution 함수를 작성해 주세요.
public class Q181843 {
	public static int solution(String my_string, String target) {

        if (my_string.contains(target)) {
            return 1; 
        } else {
            return 0; 
        }
    }

    public static void main(String[] args) {
        System.out.println(solution("banana", "ana"));  
        System.out.println(solution("banana", "wxyz")); 
    }
}


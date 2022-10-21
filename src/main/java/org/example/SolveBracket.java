package org.example;

import java.util.Arrays;
import java.util.Stack;

public class SolveBracket {

//        boolean solution(String s) {
//        boolean answer = true;
//        Stack<Character> stack = new Stack<>();
//
//        for(int i = 0; i < s.length(); i++){
//            char c = s.charAt(i);
//
//            //여는 괄호일 때
//            if(c == '('){
//                stack.push(c);
//            }
//
//            //닫는 괄호일 때
//            if(c == ')'){
//                if(stack.size() == 0){
//                    return false;
//                }
//                else stack.pop();
//            }
//        }
//        if(stack.size() != 0) answer = false;
//
//        return answer;
//    }



// 기본테스트 통과     /   효율성 테스트 실패
//    boolean solution(String s) {
//
//        while (s.indexOf("()") >= 0) {
//            s = s.replace("()", "");
//        }
//
//        return s.length() == 0;
//    }



//     기본테스트 통과     /   효율성 테스트 실패
    boolean solution(String s) {

        while (s.indexOf("()") >= 0) {
            String[] splitted = s.split("\\(\\)");
            System.out.println(Arrays.toString(splitted));
            s = String.join("", splitted);
            System.out.println(s);
        }

        return s.length() == 0;
    }

    public static void main(String[] args) {
        SolveBracket sb = new SolveBracket();
        boolean s = sb.solution("(())");
        System.out.println(s);


    }
}


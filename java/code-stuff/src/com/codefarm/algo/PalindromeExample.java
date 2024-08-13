package com.codefarm.algo;

public class PalindromeExample {

    static boolean twoPointerApproach(String input){
        if(input == null){
            return false;
        }
        int left = 0 ;
        int right = input.length() - 1;

        while(left < right){
            if(input.charAt(left) != input.charAt(right)){
                return false;
            }
           left ++;
            right --;
        }
        return true;
    }

    static boolean reverseStringWay(String input){
        if(input == null){
            return false;
        }
        String reverse = new StringBuilder(input).reverse().toString();
        return input.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.println("2 pointer approach for 'abcba' - " + twoPointerApproach("abcba"));
        System.out.println("2 pointer approach for 'abcbab' - " + twoPointerApproach("abcbab"));
        System.out.println("2 pointer approach for 'abba' - " + twoPointerApproach("abba"));
        System.out.println("2 pointer approach for 'null' - " + twoPointerApproach(null));

        System.out.println("reverseStringWay approach for 'abcba' - " + reverseStringWay("abcba"));
        System.out.println("reverseStringWay approach for 'abcbab' - " + reverseStringWay("abcbab"));
        System.out.println("reverseStringWay approach for 'abba' - " + reverseStringWay("abba"));
        System.out.println("reverseStringWay approach for 'null' - " + reverseStringWay(null));
    }
}

package org.example.dsa;

import java.util.Arrays;
import java.util.Stack;

public class ReverseVowel {
    public static void main(String[] args) {
        String s = "hello"; //Tradiep Senghi
        String[] str = s.split("");
        int i=0,j=str.length-1,iteration=0;
        while (i<j){
            iteration++;
            if(isVowel(s.charAt(i)) && isVowel(s.charAt(j))) {
                String temp = str[i];
                str[i] = str[j];
                str[j] = temp;
                i++;
                j--;
            }
            if(!(isVowel(s.charAt(i)))){
                i++;
            }
            if (!(isVowel(s.charAt(j)))) {
                j--;
            }
        }
        Arrays.stream(str).forEach(System.out::print);
        System.out.println("\nIteration "+iteration);

//        Stack<String> stk = new Stack<>();
//
//        for(int i=0; i<str.length; i++) {
//            if(isVowel(s.charAt(i))) {
//                stk.add(str[i]);
//            }
//        }
//        for (int i= 0; i<str.length; i++) {
//            if(isVowel(s.charAt(i))) {
//                str[i]=stk.pop();
//            }
//        }
//        Arrays.stream(str).forEach(i -> System.out.print(i));
    }

    public static boolean isVowel(char ch) {
        // Make the list of vowels
        String str = "aeiouAEIOU";
        return str.indexOf(ch) != -1;
    }
}

package org.example.untitled;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stack {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        java.util.Stack<Character> stack = new java.util.Stack<>();
        String S = br.readLine();
        boolean isIn = false;

        for(int i = 0; i < S.length(); i++) {
            if(S.charAt(i) == '<') {
                isIn = true;
                while(!stack.isEmpty()) {
                    sb.append(stack.pop());
                }
                sb.append(S.charAt(i));
            }

            else if(S.charAt(i) == '>') {
                isIn = false;
                sb.append(S.charAt(i));
            }

            else if(isIn) {
                sb.append(S.charAt(i));
            }

            else if(!isIn) {
                if(S.charAt(i) == ' ') {
                    while(!stack.isEmpty()) {
                        sb.append(stack.pop());
                    }
                    sb.append(S.charAt(i));
                }
                else {
                    stack.push(S.charAt(i));
                }
            }
        }
        while(!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        System.out.println(sb);


    }

}

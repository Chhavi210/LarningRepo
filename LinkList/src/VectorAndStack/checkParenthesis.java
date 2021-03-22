package VectorAndStack;

import java.util.Scanner;

public class checkParenthesis {
    public static void main(String[] args) throws Exception {
        AnotherStack<Character> s1 = new AnotherStack<>();
        Scanner sc = new Scanner(System.in);
        boolean isBalenced = true;
        System.out.println("ENTER THE STRING");
        String s2 = sc.nextLine();
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                s1.push(ch);
                continue;
            }
            if (ch == ')') {
                if (s1.peek() == '(') {
                    s1.pop();

                } else {
                    isBalenced = false;
                    break;
                }
            }
            if (ch == '}') {
                    if (s1.peek() == '{') {
                        s1.pop();

                    } else {
                        isBalenced = false;
                        break;
                    }
                }
            if (ch == ']') {
                if (s1.peek() == '[') {
                    s1.pop();

                } else {
                    isBalenced = false;
                    break;
                }
            }

            }
               if(!s1.isEmpty()){
                 isBalenced=false;
               }
            if (isBalenced) {
                System.out.println("balenced");
            } else {
                System.out.println("not balenced");
            }
        }
    }


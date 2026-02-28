package calculator;

import stack.Stack;

public class InfixToPostfixConverter {

    public String convert(String expression, Stack<Character> stack) {
        StringBuilder output = new StringBuilder();

        for (char ch : expression.toCharArray()) {

            if (Character.isDigit(ch)) {
                output.append(ch).append(" ");
            }

            else if (ch == '(') {
                stack.push(ch);
            }

            else if (ch == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    output.append(stack.pop()).append(" ");
                }
                stack.pop();
            }

            else {
                while (!stack.isEmpty() &&
                        precedence(ch) <= precedence(stack.peek())) {
                    output.append(stack.pop()).append(" ");
                }
                stack.push(ch);
            }
        }

        while (!stack.isEmpty()) {
            output.append(stack.pop()).append(" ");
        }

        return output.toString().trim();
    }

    private int precedence(char op) {
        switch (op) {
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
        }
        return -1;
    }
}
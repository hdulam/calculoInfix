package calculator;

import stack.Stack;

public class PostfixEvaluator {

    public double evaluate(String expression, Stack<Double> stack) {

        for (String token : expression.split(" ")) {

            if (token.matches("\\d+")) {
                stack.push(Double.parseDouble(token));
            } else {
                double b = stack.pop();
                double a = stack.pop();

                switch (token) {
                    case "+": stack.push(a + b); break;
                    case "-": stack.push(a - b); break;
                    case "*": stack.push(a * b); break;
                    case "/": stack.push(a / b); break;
                }
            }
        }
        return stack.pop();
    }
}
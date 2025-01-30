package Stacks_Queues;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
String[] ops ={"5","2","C","D","+"};
        System.out.println(points(ops));
    }

    public static int points(String[]operations) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < operations.length; i++) {
            String op = operations[i];
            if (op.equals("C")) {
                stack.pop();
            } else if (op.equals("D")) {
                int lastScore = stack.peek();
                stack.push(lastScore * 2);
            } else if (op.equals("+")) {
                int lastScore = stack.pop();
                int secondLast = stack.peek();
                stack.push(lastScore);
                stack.push(lastScore + secondLast);
            } else {
                stack.push(Integer.parseInt(op));
            }

        }
        int total = 0;
        while (!stack.isEmpty()) {
            total = total + stack.pop();
        }
        return total;
    }

}

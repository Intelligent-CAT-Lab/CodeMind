import java.util.Scanner;
import java.util.Stack;

public class p02263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "+":
                    int a = stack.pop();
                    int b = stack.pop();
                    stack.push(b + a);
                    break;
                case "-":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b - a);
                    break;
                case "*":
                    a = stack.pop();
                    b = stack.pop();
                    stack.push(b * a);
                    break;
                default:
                    stack.push(Integer.parseInt(input[i]));
                    break;
            }
        }
        System.out.println(stack.pop());
    }
}
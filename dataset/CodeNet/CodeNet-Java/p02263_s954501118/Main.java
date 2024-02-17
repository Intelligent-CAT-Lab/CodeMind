import java.util.Scanner;
import java.util.Stack;

public class Main {

    Scanner sc = new Scanner(System.in);

    void solve() {
        // Input
        String[] rawInputs = sc.nextLine().split(" ");

        // Solve
        Stack<String> stack = new Stack<>();
        for (String input : rawInputs) {
            switch (input) {
                case "+": {
                    Integer opl = Integer.valueOf(stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
                    Integer result = opr + opl;
                    stack.push(String.valueOf(result));
                    break;
                }
                case "-": {
                    Integer opl = Integer.valueOf(stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
                    Integer result = opr - opl;
                    stack.push(String.valueOf(result));
                    break;
                }
                case "*": {
                    Integer opl = Integer.valueOf(stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
                    Integer result = opr * opl;
                    stack.push(String.valueOf(result));
                    break;
                }
                default: {
                    stack.push(input);
                }
            }
        }
        String result = stack.pop();

        // Output
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}


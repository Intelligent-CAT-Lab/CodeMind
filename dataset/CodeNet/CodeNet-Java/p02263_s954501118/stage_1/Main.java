import java.util.Scanner;
import java.util.Stack;

public class Main {

    Scanner sc = new Scanner(System.in);

    void solve() {
        // Input
var newVariable_0 = sc.nextLine();        String[] rawInputs = newVariable_0.split(" ");

        // Solve
        Stack<String> stack = new Stack<>();
        for (String input : rawInputs) {
            switch (input) {
                case "+": {
var newVariable_1 = stack.pop();                    Integer opl = Integer.valueOf(newVariable_1);
var newVariable_2 = stack.pop();                    Integer opr = Integer.valueOf(newVariable_2);
                    Integer result = opr + opl;
var newVariable_3 = String.valueOf(result);                    stack.push(newVariable_3);
                    break;
                }
                case "-": {
var newVariable_4 = stack.pop();                    Integer opl = Integer.valueOf(newVariable_4);
var newVariable_5 = stack.pop();                    Integer opr = Integer.valueOf(newVariable_5);
                    Integer result = opr - opl;
var newVariable_6 = String.valueOf(result);                    stack.push(newVariable_6);
                    break;
                }
                case "*": {
var newVariable_7 = stack.pop();                    Integer opl = Integer.valueOf(newVariable_7);
var newVariable_8 = stack.pop();                    Integer opr = Integer.valueOf(newVariable_8);
                    Integer result = opr * opl;
var newVariable_9 = String.valueOf(result);                    stack.push(newVariable_9);
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


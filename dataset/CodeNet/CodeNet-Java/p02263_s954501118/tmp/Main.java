import java.util.Scanner;
import java.util.Stack;

public class Main {

    Scanner sc = new Scanner(System.in);

    void solve() {
        // Input
        String[] rawInputs = sc.nextLine().split(" ");
System.out.println("[INST]9;rawInputs;sc.nextLine().split(' ');"+rawInputs);
System.out.println("[INST]9;None;sc.nextLine();"+sc.nextLine());

        // Solve
        Stack<String> stack = new Stack<>();
        for (String input : rawInputs) {
            switch (input) {
                case "+": {
                    Integer opl = Integer.valueOf(stack.pop());
System.out.println("[INST]16;opl;Integer.valueOf(stack.pop());"+opl);
System.out.println("[INST]16;None;stack.pop();"+stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
System.out.println("[INST]17;opr;Integer.valueOf(stack.pop());"+opr);
System.out.println("[INST]17;None;stack.pop();"+stack.pop());
                    Integer result = opr + opl;
                    stack.push(String.valueOf(result));
System.out.println("[INST]19;None;stack.push(String.valueOf(result));"+stack.push(String.valueOf(result)));
System.out.println("[INST]19;None;String.valueOf(result);"+String.valueOf(result));
                    break;
                }
                case "-": {
                    Integer opl = Integer.valueOf(stack.pop());
System.out.println("[INST]23;opl;Integer.valueOf(stack.pop());"+opl);
System.out.println("[INST]23;None;stack.pop();"+stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
System.out.println("[INST]24;opr;Integer.valueOf(stack.pop());"+opr);
System.out.println("[INST]24;None;stack.pop();"+stack.pop());
                    Integer result = opr - opl;
                    stack.push(String.valueOf(result));
System.out.println("[INST]26;None;stack.push(String.valueOf(result));"+stack.push(String.valueOf(result)));
System.out.println("[INST]26;None;String.valueOf(result);"+String.valueOf(result));
                    break;
                }
                case "*": {
                    Integer opl = Integer.valueOf(stack.pop());
System.out.println("[INST]30;opl;Integer.valueOf(stack.pop());"+opl);
System.out.println("[INST]30;None;stack.pop();"+stack.pop());
                    Integer opr = Integer.valueOf(stack.pop());
System.out.println("[INST]31;opr;Integer.valueOf(stack.pop());"+opr);
System.out.println("[INST]31;None;stack.pop();"+stack.pop());
                    Integer result = opr * opl;
                    stack.push(String.valueOf(result));
System.out.println("[INST]33;None;stack.push(String.valueOf(result));"+stack.push(String.valueOf(result)));
System.out.println("[INST]33;None;String.valueOf(result);"+String.valueOf(result));
                    break;
                }
                default: {
                    stack.push(input);
System.out.println("[INST]37;None;stack.push(input);"+stack.push(input));
                }
            }
        }
        String result = stack.pop();
System.out.println("[INST]41;result;stack.pop();"+result);

        // Output
        System.out.println(result);
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}


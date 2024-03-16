import java.util.Scanner;
import java.util.Stack;

public class p02263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split("\\s+");
        Stack<Integer> s = new Stack<>();

        for (String token : n) {
            switch (token) {
                case "+":
                    int a = s.pop();
                    int b = s.pop();
                    s.push(b + a);
                    break;
                case "-":
                    a = s.pop();
                    b = s.pop();
                    s.push(b - a);
                    break;
                case "*":
                    a = s.pop();
                    b = s.pop();
                    s.push(b * a);
                    break;
                default:
                    s.push(Integer.parseInt(token));
                    break;
            }
        }

        System.out.println(s.pop());

        scanner.close();
    }
}
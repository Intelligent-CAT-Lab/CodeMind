import java.util.Scanner;
import java.util.Stack;

public class p02263 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] n = scanner.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b + a);
            } else if (n[i].equals("-")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b - a);
            } else if (n[i].equals("*")) {
                int a = s.pop();
                int b = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.pop());
    }
}
import java.util.*;

public class p02263 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i].equals("+")) {
                int b = s.pop();
                int a = s.pop();
                s.push(b + a);
            } else if (n[i].equals("-")) {
                int b = s.pop();
                int a = s.pop();
                s.push(b - a);
            } else if (n[i].equals("*")) {
                int b = s.pop();
                int a = s.pop();
                s.push(b * a);
            } else {
                s.push(Integer.parseInt(n[i]));
            }
        }
        System.out.println(s.pop());
    }
}
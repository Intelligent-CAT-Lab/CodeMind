import java.util.*;

public class p03999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int ans = 0;
        for (int i = 0; i < Math.pow(2, s.length() - 1); i++) {
            String pat = s.substring(0, 1);
            int index = 1;
            for (int j = 0; j < s.length() - 1; j++) {
                if ((i >> j) % 2 == 1) {
                    pat += "+";
                }
                pat += s.substring(index, index + 1);
                index++;
            }
            //System.out.println(pat);
            ans += eval(pat);
        }
        System.out.println(ans);
    }

    public static int eval(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Character> op = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int b = stack.pop();
                int a = stack.pop();
                if (op.isEmpty() || op.peek() == '+') {
                    stack.push(a + b);
                } else {
                    stack.push(a - b);
                }
                op.pop();
            }
        }
        return stack.pop();
    }
}
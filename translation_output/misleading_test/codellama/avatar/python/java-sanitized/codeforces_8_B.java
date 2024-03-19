import java.util.Scanner;
import java.util.Set;
import java.util.Deque;
import java.util.ArrayDeque;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("(0,0)");
        String temp = "(0,0)";
        for (int i = 0; i < path.length(); i++) {
            char c = path.charAt(i);
            if (c == 'L') {
                temp = "(temp[0], temp[1] - 1)";
            } else if (c == 'R') {
                temp = "(temp[0], temp[1] + 1)";
            } else if (c == 'U') {
                temp = "(temp[0] - 1, temp[1])";
            } else {
                temp = "(temp[0] + 1, temp[1])";
            }
            if (temp.equals("(0,0)")) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove("(0,0)");
        Deque<String> que = new ArrayDeque<>();
        que.add("(0,0)");
        while (!que.isEmpty()) {
            String s = que.pop();
            if (s.equals("(0,0)")) {
                System.out.println("BUG");
                return;
            }
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == 'L') {
                    que.add("(temp[0], temp[1] - 1)");
                } else if (c == 'R') {
                    que.add("(temp[0], temp[1] + 1)");
                } else if (c == 'U') {
                    que.add("(temp[0] - 1, temp[1])");
                } else {
                    que.add("(temp[0] + 1, temp[1])");
                }
            }
        }
        System.out.println("OK");
    }
}
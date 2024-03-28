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
                temp = "(0," + (Integer.parseInt(temp.substring(2)) - 1) + ")";
            } else if (c == 'R') {
                temp = "(0," + (Integer.parseInt(temp.substring(2)) + 1) + ")";
            } else if (c == 'U') {
                temp = "(" + (Integer.parseInt(temp.substring(1)) - 1) + ",0)";
            } else {
                temp = "(" + (Integer.parseInt(temp.substring(1)) + 1) + ",0)";
            }
            if (coord.contains(temp)) {
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
            int i = Integer.parseInt(s.substring(1));
            int j = Integer.parseInt(s.substring(2));
            for (int p = i + 1; p <= j; p++) {
                for (int q = i - 1; q <= j; q++) {
                    if (coord.contains("(" + p + "," + q + ")")) {
                        coord.remove("(" + p + "," + q + ")");
                        que.add("(" + p + "," + q + ")");
                    }
                }
            }
        }
        System.out.println("OK");
    }
}
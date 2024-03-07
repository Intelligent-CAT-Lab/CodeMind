import java.util.Scanner;
import java.util.Set;
import java.util.Deque;

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
                temp = "(0," + (Integer.parseInt(temp.substring(temp.indexOf(",") + 1)) - 1) + ")";
            } else if (c == 'R') {
                temp = "(0," + (Integer.parseInt(temp.substring(temp.indexOf(",") + 1)) + 1) + ")";
            } else if (c == 'U') {
                temp = "(" + (Integer.parseInt(temp.substring(temp.indexOf(",") - 1)) - 1) + ",0)";
            } else {
                temp = "(" + (Integer.parseInt(temp.substring(temp.indexOf(",") - 1)) + 1) + ",0)";
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
            String temp = que.pop();
            if (temp.equals("(0,0)")) {
                System.out.println("BUG");
                return;
            }
            for (int i = 0; i < 4; i++) {
                String p = temp.substring(0, temp.indexOf(","));
                String q = temp.substring(temp.indexOf(",") + 1);
                if (p.equals("0") && q.equals("0")) {
                    continue;
                }
                String newTemp = p + "," + q;
                if (coord.contains(newTemp)) {
                    coord.remove(newTemp);
                    que.add(newTemp);
                }
            }
        }
        System.out.println("OK");
    }
}
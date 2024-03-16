import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        int x = 0, y = 0;
        for (char c : path.toCharArray()) {
            if (c == 'L') y--;
            else if (c == 'R') y++;
            else if (c == 'U') x--;
            else x++;
            String temp = x + "," + y;
            if (coord.contains(temp)) {
                System.out.println("BUG");
                System.exit(0);
            }
            coord.add(temp);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                System.exit(0);
            }
            String[] curr = que.poll().split(",");
            int i = Integer.parseInt(curr[0]), j = Integer.parseInt(curr[1]);
            if (coord.contains((i + 1) + "," + j)) {
                coord.remove((i + 1) + "," + j);
                que.add((i + 1) + "," + j);
            }
            if (coord.contains((i - 1) + "," + j)) {
                coord.remove((i - 1) + "," + j);
                que.add((i - 1) + "," + j);
            }
            if (coord.contains(i + "," + (j + 1))) {
                coord.remove(i + "," + (j + 1));
                que.add(i + "," + (j + 1));
            }
            if (coord.contains(i + "," + (j - 1))) {
                coord.remove(i + "," + (j - 1));
                que.add(i + "," + (j - 1));
            }
        }
        System.out.println("OK");
    }
}
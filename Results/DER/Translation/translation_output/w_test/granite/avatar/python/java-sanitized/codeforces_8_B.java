import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        Set<String> coord = new HashSet<>();
        coord.add("0,0");
        String[] dirs = {"L", "R", "U", "D"};
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        int x = 0, y = 0;
        for (char c : path.toCharArray()) {
            int dir = Arrays.asList(dirs).indexOf(c);
            x += dx[dir];
            y += dy[dir];
            String pos = x + "," + y;
            if (coord.contains(pos)) {
                System.out.println("BUG");
                return;
            }
            coord.add(pos);
        }
        coord.remove("0,0");
        Queue<String> que = new LinkedList<>();
        que.add("0,0");
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            String pos = que.poll();
            String[] parts = pos.split(",");
            int x0 = Integer.parseInt(parts[0]);
            int y0 = Integer.parseInt(parts[1]);
            for (int dir = 0; dir < 4; dir++) {
                int x1 = x0 + dx[dir];
                int y1 = y0 + dy[dir];
                String pos1 = x1 + "," + y1;
                if (coord.contains(pos1)) {
                    coord.remove(pos1);
                    que.add(pos1);
                }
            }
        }
        System.out.println("OK");
    }
}
import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String path = sc.nextLine();
        Set<int[]> coord = new HashSet<>();
        int[] temp = {0, 0};
        for (char c : path.toCharArray()) {
            if (c == ' L') {
                temp = new int[]{temp[0], temp[1] - 1};
            } else if (c == ' R') {
                temp = new int[]{temp[0], temp[1] + 1};
            } else if (c == ' U') {
                temp = new int[]{temp[0] - 1, temp[1]};
            } else {
                temp = new int[]{temp[0] + 1, temp[1]};
            }
            if (Arrays.equals(temp, coord.iterator().next())) {
                System.out.println("BUG");
                return;
            }
            coord.add(temp);
        }
        coord.remove(new int[]{0, 0});
        Deque<int[]> que = new ArrayDeque<>(Arrays.asList(new int[]{0, 0}));
        while (!que.isEmpty()) {
            if (que.size() > 1) {
                System.out.println("BUG");
                return;
            }
            int[] p = que.poll();
            for (int[] q : new int[][]{p[0] + 1, p[1], p[0] - 1, p[1]}) {
                if (Arrays.equals(q, coord.iterator().next())) {
                    coord.remove(q);
                    que.add(q);
                }
            }
        }
        System.out.println("OK");
    }
}
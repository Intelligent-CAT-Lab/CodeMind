import java.util.*;

public class codeforces_8_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<int[]> coord = new HashSet<>();
        int[] temp = {0, 0};
        String path = sc.nextLine();
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
            int[] temp = que.poll();
            for (int[] dir : new int[][]{{1, 0}, {-1, 0}, {0, 1}, {0, -1}}) {
                int[] pq = new int[]{temp[0] + dir[0], temp[1] + dir[1]};
                if (Arrays.equals(pq, coord.iterator().next())) {
                    coord.remove(pq);
                    que.add(pq);
                }
            }
        }
        System.out.println("OK");
    }
}
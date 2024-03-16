import java.util.*;

public class p02140 {
    static final int INF = 1000000007;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int R = scanner.nextInt();
        int C = scanner.nextInt();
        int ay = scanner.nextInt();
        int ax = scanner.nextInt();
        int by = scanner.nextInt();
        int bx = scanner.nextInt();

        int[][] dists = new int[R][C];
        int[][] ptns = new int[R][C];
        for (int[] row : dists) {
            Arrays.fill(row, INF);
        }
        
        for (int[] row : ptns) {
            Arrays.fill(row, 0);
        }

        dists[ay][ax] = 0;
        ptns[ay][ax] = 1;
        Deque<int[]> q = new ArrayDeque<>();
        q.add(new int[]{0, ax, ay});
        
        int[] dxs = {1, 0, -1, 0};
        int[] dys = {0, 1, 0, -1};

        Integer ans_d = null;

        while (!q.isEmpty()) {
            int[] current = q.poll();
            int d = current[0], x = current[1], y = current[2];
            
            if (ans_d != null && d > ans_d) {
                break;
            }
            
            if (x == bx && y == by) {
                ans_d = d;
            }

            if (d > dists[y][x]) continue;
            dists[y][x] = d;

            for (int i = 0; i < 4; i++) {
                int dx = dxs[i], dy = dys[i];
                int nx = x + dx, ny = y + dy;

                if (!(0 <= nx && nx < C) || !(0 <= ny && ny < R)) continue;
                if (d + 1 > dists[ny][nx]) continue;
                
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= INF;
            }

            int[][] teleport = {{x, 0}, {x, R - 1}, {0, y}, {C - 1, y}};

            for (int[] tp : teleport) {
                int nx = tp[0], ny = tp[1];
                if (d + 1 > dists[ny][nx]) continue;
                if (dists[ny][nx] == INF) {
                    q.add(new int[]{d + 1, nx, ny});
                    dists[ny][nx] = d + 1;
                }
                ptns[ny][nx] += ptns[y][x];
                ptns[ny][nx] %= INF;
            }
        }
        System.out.println(ans_d + " " + ptns[by][bx] % INF);
    }
}
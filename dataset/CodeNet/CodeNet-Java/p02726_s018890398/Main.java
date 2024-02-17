// bfsで解く
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        MyScanner sc = new MyScanner();

        int n = sc.nextInt();
        int x = sc.nextInt() - 1;
        int y = sc.nextInt() - 1;

        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            int[] dist = new int[n];
            Arrays.fill(dist, -1);  // 配列初期化
            Queue<Integer> queue = new ArrayDeque<>();
            queue.add(i);
            dist[i] = 0;

            while (!queue.isEmpty()) {
                int p = queue.poll();

                // 一つ前
                if (p-1 >= 0 && dist[p-1] == -1) {
                    dist[p-1] = dist[p] + 1;
                    queue.add(p-1);
                }
                // 一つ後
                if (p+1 < n && dist[p+1] == -1) {
                    dist[p+1] = dist[p] + 1;
                    queue.add(p+1);
                }
                // xからy
                if (p == x && dist[y] == -1) {
                    dist[y] = dist[p] + 1;
                    queue.add(y);
                }
                // yからx
                if (p == y && dist[x] == -1) {
                    dist[x] = dist[p] + 1;
                    queue.add(x);
                }
            }

            for (int j = i; j < n; j++)
                ans[dist[j]]++;
        }

        for (int i = 1; i < n; i++)
            System.out.println(ans[i]);
    }

    static class MyScanner {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in), 1 << 15);
        StringTokenizer tokenizer;

        String next() {
            try {
                while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                    tokenizer = new StringTokenizer(reader.readLine());
                }
            } catch (IOException ignored) {
            }
            return tokenizer.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
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
var newVariable_0 = queue.add(i);            dist[i] = 0;

var newVariable_1 = queue.isEmpty();            while (!newVariable_1) {
                int p = queue.poll();

                // 一つ前
                if (p-1 >= 0 && dist[p-1] == -1) {
                    dist[p-1] = dist[p] + 1;
var newVariable_2 = queue.add(p-1);                }
                // 一つ後
                if (p+1 < n && dist[p+1] == -1) {
                    dist[p+1] = dist[p] + 1;
var newVariable_3 = queue.add(p+1);                }
                // xからy
                if (p == x && dist[y] == -1) {
                    dist[y] = dist[p] + 1;
var newVariable_4 = queue.add(y);                }
                // yからx
                if (p == y && dist[x] == -1) {
                    dist[x] = dist[p] + 1;
var newVariable_5 = queue.add(x);                }
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
var newVariable_6 = tokenizer.hasMoreTokens();                while (tokenizer == null || !newVariable_6) {
var newVariable_7 = reader.readLine();                    tokenizer = new StringTokenizer(newVariable_7);
                }
            } catch (IOException ignored) {
            }
var newVariable_8 = tokenizer.nextToken();            return newVariable_8;
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }
    }
}
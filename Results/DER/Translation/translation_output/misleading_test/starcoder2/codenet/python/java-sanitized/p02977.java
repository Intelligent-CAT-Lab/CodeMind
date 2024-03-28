import java.util.*;
import java.io.*;

public class p02977 {
    static int n;
    static int[] root;
    static int[] vis;
    static ArrayList> g;
 static ArrayList> e;

 static void dfs(int u) {
 vis[u] = 1;
 root[u] ^= (u - 1) % n + 1;
 for (int v : g.get(u)) {
 if (vis[v] == 1)
 continue;
 root[v] = root[u];
 dfs(v);
 }
 }

 static void get(int n) {
 e = new ArrayList>();
 int p = 1;
 while (p \* 2 <= n)
 p \*= 2;
 if (n != p) {
 // make line graph
 int m = n;
 while (m % 4 != 3)
 m--;
 for (int i = 1; i < m; i++) {
 e.add(Arrays.asList(i, i + 1));
 e.add(Arrays.asList(n + i, n + i + 1));
 }
 e.add(Arrays.asList(m, n + 1));
 if (n % 4 == 1 || n % 4 == 2) {
 m = n;
 if (n % 4 == 2)
 m--;
 e.add(Arrays.asList(m - 1, m));
 e.add(Arrays.asList(m, n + 1));
 e.add(Arrays.asList(n + 1, n + m - 1));
 e.add(Arrays.asList(n + m - 1, n + m));
 }
 if (n % 4 == 0 || n % 4 == 2) { // not a power of 2
 int t = n - 1;
 e.add(Arrays.asList(n, t));
 for (int i = 1; i < n + 1; i++) {
 t ^= i;
 if (t == n) {
 e.add(Arrays.asList(n + i, n + n));
 break;
 }
 }
 }
 }
 }

 public static void main(String[] args) throws IOException {
 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 n = Integer.parseInt(br.readLine());
 g = new ArrayList>();
 for (int i = 0; i < 2 \* n + 1; i++)
 g.add(new ArrayList());
 e = new ArrayList>();
 get(n);
 if (e != null) {
 System.out.println("Yes");
 for (int i = 0; i < e.size(); i++) {
 System.out.println(e.get(i).get(0) + " " + e.get(i).get(1));
 }
 } else {
 System.out.println("No");
 }
 }
}


Upvotes: 0
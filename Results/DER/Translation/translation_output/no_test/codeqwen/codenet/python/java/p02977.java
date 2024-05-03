Here is the Java version of your Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        List<List<Integer>> e = get(n);
        if (e != null) {
            System.out.println("Yes");
            for (List<Integer> edge : e) {
                System.out.println(edge.get(0) + " " + edge.get(1));
            }
        } else {
            System.out.println("No");
        }
    }

    public static List<List<Integer>> get(int n) {
        List<List<Integer>> e = new ArrayList<>();
        int p = 1;
        while (p * 2 <= n) {
            p *= 2;
        }
        if (n != p) {
            // make line graph
            int m = n;
            while (m % 4 != 3) m--;
            for (int i = 1; i <= m; i++) {
                e.add(Arrays.asList(i, i + 1));
                e.add(Arrays.asList(n + i, n + i + 1));
            }
            e.add(Arrays.asList(m, n + 1));
            if (n % 4 == 1 || n % 4 == 2) {
                m = n;
                if (n % 4 == 2) m--;
                e.add(Arrays.asList(m - 1, m));
                e.add(Arrays.asList(m, n + 1));
                e.add(Arrays.asList(n + 1, n + m - 1));
                e.add(Arrays.asList(n + m - 1, n + m));
            }
            if (n % 4 == 0 || n % 4

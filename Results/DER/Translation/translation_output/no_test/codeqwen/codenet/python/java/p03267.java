Here is the Java version of your Python code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i+1, (int)Math.pow(2, i-1)});
            edges.add(new int[]{i, i+1, 0});
        }
        // 2**(length-1)-1ã¾ã§ã®æ°ã¯å®äº
        // Lã«è¿ãåãç«¯ããå¦çãã¦ãã
        for (int i = 0; i < length-1; i++) {
            if ((L & (1 << i)) != 0) {
                L -= (int)Math.pow(2, i);
                edges.add(new int[]{i+1, length, L});
            }
        }
        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the standard input, calculates the binary representation of the integer, and then constructs a list of edges based on the binary representation. It then prints the length of the binary representation and the number of edges, followed by the edges themselves.

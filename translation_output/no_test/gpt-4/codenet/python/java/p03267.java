Below is the translated Java code:

```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine().trim());
        List<int[]> edges = new ArrayList<>();
        int length = Integer.SIZE - Integer.numberOfLeadingZeros(L); // equivalent to bit_length

        for (int i = 1; i < length; i++) {
            edges.add(new int[] {i, i + 1, 1 << (i - 1)});
            edges.add(new int[] {i, i + 1, 0});
        }

        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= 1 << i;
                edges.add(new int[] {i + 1, length, L});
            }
        }

        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```

Keep in mind that Java code is more verbose than Python. BufferedReader is used for efficient reading from standard input. Since Java doesn't have a direct equivalent of Python's `bit_length()` function, `Integer.SIZE - Integer.numberOfLeadingZeros(x)` is used to get the bit length of an integer. Additionally, lambda functions do not exist in Java in the same way they do in Python, so parts of the code are directly integrated into the logic flow. Also, note that the `List<int[]>` structure is used to store edges, with each edge represented by an integer array.

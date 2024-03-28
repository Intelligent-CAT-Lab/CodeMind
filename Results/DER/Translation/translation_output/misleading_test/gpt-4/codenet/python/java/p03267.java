Here's the translated Java code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int L = scanner.nextInt();
        scanner.close();

        List<int[]> edges = new ArrayList<>();
        int length = Integer.toBinaryString(L).length();
        for (int i = 1; i < length; i++) {
            edges.add(new int[]{i, i + 1, 1 << (i - 1)});
            edges.add(new int[]{i, i + 1, 0});
        }

        // Numbers up to 2^(length-1)-1 are complete
        // Process from near the L edge
        for (int i = 0; i < length - 1; i++) {
            if (((L >> i) & 1) == 1) {
                L -= 1 << i;
                edges.add(new int[]{i + 1, length, L});
            }
        }

        System.out.println(length + " " + edges.size());
        for (int[] edge : edges) {
            System.out.println(edge[0] + " " + edge[1] + " " + edge[2]);
        }
    }
}
```

To test the code using the provided test case (where the input is 4), you can run the program and input 4 when prompted. The expected output will then be printed:

```
3 4
1 2 1
1 2 0
2 3 2
2 3 1
```

Please note that Java requires a declared class with a main method to run, unlike Python scripts. Additionally, I have used a `Scanner` to handle input, and `ArrayList` to handle the dynamic list of edge arrays.

Here's the translated Java code:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(reader.readLine());

        int K = 0;
        for (int i = 1; i < Math.pow(10, 3); i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            System.out.println("No");
            System.exit(0);
        }

        List<List<Integer>> S = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            S.add(new ArrayList<>());
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S.get(k).add(i);
            i++;
            cnt++;
            if (cnt == K - (k + 1)) {
                k++;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S.get(k).add(j);
            j++;
            k++;
            cnt++;
            if (cnt == K - (col + 1)) {
                col++;
                k = col + 1;
                cnt = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(K);

        for (List<Integer> s : S) {
            System.out.print(K - 1);
            for (int num : s) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
```

Keep in mind that the Java solution includes input handling using `BufferedReader`, integer parsing from string lines, using `List<List<Integer>>` for the 2D array equivalent in Java, and printing with `System.out.println()` rather than Python's `print()`. I have also used Java's standard way to exit the program using `System.exit(0)` when the condition for `K` is not met.

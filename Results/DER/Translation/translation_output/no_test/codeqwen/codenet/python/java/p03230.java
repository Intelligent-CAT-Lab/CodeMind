Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int K = 0;
        for (int i = 1; i < 1000; i++) {
            if (i * (i - 1) / 2 == N) {
                K = i;
                break;
            }
        }

        if (K == 0) {
            System.out.println("No");
            return;
        }

        int[][] S = new int[K][];
        for (int i = 0; i < K; i++) {
            S[i] = new int[K - i];
        }

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            S[k][cnt] = i;
            i += 1;
            cnt += 1;
            if (cnt == K - (k + 1)) {
                k += 1;
                cnt = 0;
            }
        }

        int j = 1;
        k = 1;
        cnt = 0;
        int col = 0;
        while (j <= N) {
            S[k][cnt] = j;
            j += 1;
            k += 1;
            cnt += 1;
            if (cnt == K - (col + 1)) {
                col += 1;
                k = col + 1;
                cnt = 0;
            }
        }

        System.out.println("Yes");
        System.out.println(K);

        for (int[] s : S) {
            System.out.println(K - 1);
            for (int num : s) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
```

Please note

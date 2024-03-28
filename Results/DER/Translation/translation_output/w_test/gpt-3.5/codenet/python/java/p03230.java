```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

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

        int[][] S = new int[K][];

        int i = 1;
        int k = 0;
        int cnt = 0;
        while (i <= N) {
            if (S[k] == null) {
                S[k] = new int[K - k];
            }
            S[k][cnt] = i;
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
            if (S[k] == null) {
                S[k] = new int[K - k];
            }
            S[k][cnt] = j;
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

        for (int[] s : S) {
            System.out.print(K - 1);
            for (int num : s) {
                System.out.print(" " + num);
            }
            System.out.println();
        }
    }
}
```
```

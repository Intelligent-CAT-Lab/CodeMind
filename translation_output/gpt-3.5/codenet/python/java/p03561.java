```java
import java.util.Scanner;

public class Seishin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();

        if (K % 2 == 0) {
            int[] arr = new int[N];
            arr[0] = K / 2;
            for (int i = 1; i < N; i++) {
                arr[i] = K;
            }
            for (int num : arr) {
                System.out.print(num + " ");
            }
        } else {
            int[] X = new int[N];
            int mid = (K + 1) / 2;
            for (int i = 0; i < N; i++) {
                X[i] = mid;
            }
            for (int i = 0; i < N / 2; i++) {
                if (X[N - 1] == 1) {
                    N--;
                } else {
                    X[N - 1]--;
                    for (int j = N; j < X.length; j++) {
                        X[j] = K;
                    }
                }
            }
            for (int num : X) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}
```

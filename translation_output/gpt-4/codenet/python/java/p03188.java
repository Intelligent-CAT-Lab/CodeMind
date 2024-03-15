Here's the translated Java code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        if (K <= 500) {
            System.out.println(K);
            for (int i = 1; i <= K; ++i) {
                for (int j = 0; j < K; ++j) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            int KUP = (((K + 1) / 2 + 3) / 4) * 4;
            System.out.println(KUP);

            int[][] ANS = new int[KUP][KUP];

            int begin = 0;
            for (int i = 0; i < KUP; ++i) {
                for (int j = 0; j < KUP; ++j) {
                    if (i % 2 == 0) {
                        ANS[i][(j + begin) % KUP] = j + 1;
                    } else {
                        ANS[i][(j + begin) % KUP] = j + 1 + KUP;
                    }
                }
                begin++;
            }

            for (int i = 0; i < KUP * 2 - K; ++i) {
                for (int j = 0; j < KUP; ++j) {
                    for (int l = 0; l < KUP; ++l) {
                        if (ANS[j][l] == KUP * 2 - i) {
                            ANS[j][l] = KUP * 2 - i - KUP;
                        }
                    }
                }
            }

            for (int[] ans : ANS) {
                for (int num : ans) {
                    System.out.print(num + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
```

This code performs the same logic as the provided Python code. It reads an integer `K` from the input, and if `K` is less or equal to 500, it prints `K` followed by a `K`x`K` matrix, where each row contains the row index repeated `K` times. If `K` is greater than 500, it calculates a value `KUP`, initializes a `KUP`x`KUP` matrix `ANS` and fills it with a special pattern, modifying it further based on specific criteria, and finally prints the matrix.

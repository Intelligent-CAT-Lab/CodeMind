Here is the Python code translated into Java:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int KUP;

        if (K <= 500) {
            System.out.println(K);
            for (int i = 1; i <= K; ++i) {
                for (int j = 0; j < K; ++j) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            KUP = (((K + 1) / 2 + 3) / 4) * 4;
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

            for (int i = 0; i < KUP; ++i) {
                for (int j = 0; j < KUP; ++j) {
                    System.out.print(ANS[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
```

Please replace `Main` with the appropriate class name as per your requirements. This code should be compiled and executed in a Java environment where it will take an integer input from the user and output the result in the format specified in the original Python code. This translation assumes that the inputs are provided in a manner similar to the Python code (i.e., via standard input).

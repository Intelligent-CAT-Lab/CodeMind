Below is the translated Java code for the provided Python code. Note that in Java, index-based loops are more common than "for-each" style loops as seen in Python, and input/output is typically handled differently using classes like `Scanner` for input and `System.out` for output. Also, Java uses zero-based indexing, so adjustments are made accordingly.

```java
import java.util.Scanner;

public class TestClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();

        if (K <= 500) {
            System.out.println(K);
            for (int i = 1; i <= K; i++) {
                for (int j = 0; j < K; j++) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        } else {
            int KUP = ((K + 1) / 2 + 3) / 4 * 4;
            System.out.println(KUP);

            int[][] ANS = new int[KUP][KUP];

            int begin = 0;
            for (int i = 0; i < KUP; i++) {
                for (int j = 0; j < KUP; j++) {
                    if (i % 2 == 0) {
                        ANS[i][(j + begin) % KUP] = j + 1;
                    } else {
                        ANS[i][(j + begin) % KUP] = j + 1 + KUP;
                    }
                }
                begin++;
            }

            for (int i = 0; i < KUP * 2 - K; i++) {
                for (int j = 0; j < KUP; j++) {
                    for (int l = 0; l < KUP; l++) {
                        if (ANS[j][l] == KUP * 2 - i) {
                            ANS[j][l] = KUP * 2 - i - KUP;
                        }
                    }
                }
            }

            for (int[] ans : ANS) {
                for (int an : ans) {
                    System.out.print(an + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
```
Make sure you have a class named TestClass or alter the class name as per your requirements while maintaining the `public static void main(String[] args)` as the entry point for the application. This code will read an integer from the standard input and output the results as given in the Python program.

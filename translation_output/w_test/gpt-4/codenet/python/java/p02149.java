Here's the equivalent Java code for the given Python code along with an example test case:

```java
import java.util.Scanner;

public class ScoreEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] S = new int[3];
        for (int i = 0; i < 3; i++) {
            S[i] = sc.nextInt();
        }

        int maxIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (S[i] > S[maxIndex]) {
                maxIndex = i;
            }
        }

        if (maxIndex == 0) {
            System.out.println("A");
        } else if (maxIndex == 1) {
            System.out.println("B");
        } else if (maxIndex == 2) {
            System.out.println("C");
        }

        sc.close();
    }
}
```

If you place this Java code within a file named `ScoreEvaluator.java`, compile it with `javac ScoreEvaluator.java`, and then run it with `java ScoreEvaluator`, it will wait for your input. When you input `1000 900 850` and press enter, the output will be:

```
A
```

This recreates the logic of the Python code within a Java program.

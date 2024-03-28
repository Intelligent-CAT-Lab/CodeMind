Here's the equivalent Java code that accomplishes the same logic as your Python script:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        boolean canBeAns = false;
        int k = 1;
        for (k = 1; k < 100000; k++) {
            if (2 * N == k * (k - 1)) {
                canBeAns = true;
                break;
            } else if (2 * N < k * (k - 1)) {
                break;
            }
        }
        
        if (!canBeAns) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
            System.out.println(k);
            int[][] sGrid = new int[k][k - 1];
            for (int i = 1; i <= k; i++) {
                for (int j = 0; j < k - i; j++) {
                    sGrid[i - 1][i - 1 + j] = (i - 1) * k - (i * (i - 1) / 2) + 1 + j;
                    sGrid[i + j][i - 1] = (i - 1) * k - (i * (i - 1) / 2) + 1 + j;
                }
            }
            
            for (int i = 0; i < k; i++) {
                System.out.print((k - 1) + " ");
                for (int j = 0; j < k - 1; j++) {
                    System.out.print(sGrid[i][j] + " ");
                }
                System.out.println();
            }
        }
        scanner.close();
    }
}
```

In the Java code above, we import the `Scanner` class for reading the input, loop similarly to the Python code to determine whether there's a valid answer, and then create and print the grid if `canBeAns` is true.

Make sure to compile this Java code using a Java compiler, and execute it with a Java runtime environment to test with your provided input and expected output.

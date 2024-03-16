Here is the equivalent Java code to perform the same functionality as the provided Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        ArrayList<Integer> A = new ArrayList<>();
        int S = 0;
        for (int i = 1; i <= N; i++) {
            if (S >= N) {
                break;
            }
            S += i;
            A.add(i);
        }

        int x = sum(A) - N;
        for (int a : A) {
            if (x != a) {
                System.out.println(a);
            }
        }
    }

    public static int sum(ArrayList<Integer> list) {
        int total = 0;
        for (int number : list) {
            total += number;
        }
        return total;
    }
}
```

To run this code, you should use a Java environment and provide input through the console. The input is read via the `Scanner` class, and the output will be printed to the console.

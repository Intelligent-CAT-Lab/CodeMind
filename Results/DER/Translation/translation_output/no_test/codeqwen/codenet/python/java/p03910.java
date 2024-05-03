Here is the Java version of your Python code:

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

        int x = A.stream().mapToInt(Integer::intValue).sum() - N;
        for (int a : A) {
            if (x == a) {
                continue;
            }
            System.out.println(a);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer N from the user, calculates the sum of integers from 1 to N, and stores them in an ArrayList. Then it calculates the difference between the sum of the ArrayList and N, and prints all the elements of the ArrayList except for the one that equals this difference.

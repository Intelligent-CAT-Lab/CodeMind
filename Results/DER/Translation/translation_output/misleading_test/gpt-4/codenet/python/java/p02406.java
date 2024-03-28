Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;

public class NumbersWithThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || String.valueOf(i).contains("3")) {
                A.add(i);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        if (!A.isEmpty()) {
            System.out.println(A.get(A.size() - 1));
        }
        scanner.close();
    }
}
```

To test the Java program with the test input `30`, you would compile and run the Java code, input `30` when prompted, and expect to see the output:

```
 3 6 9 12 13 15 18 23 24 27 30
```

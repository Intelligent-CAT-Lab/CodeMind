Here is the Java version of your Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 10 == 3 || (i / 10) % 10 == 3) {
                A.add(i);
            }
        }
        System.out.print(" ");
        for (int i = 0; i < A.size() - 1; i++) {
            System.out.print(A.get(i) + " ");
        }
        System.out.println(A.get(A.size() - 1));
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` from the user, then creates an ArrayList `A`. It then loops through all integers from 1 to `n`, and if the integer is divisible by 3, or contains the digit 3, it adds it to the ArrayList `A`. Finally, it prints out all the integers in `A`, separated by spaces.

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
            if (i % 3 == 0) {
                A.add(i);
            } else if (String.valueOf(i).contains("3")) {
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

This Java code does the same thing as your Python code. It reads an integer from the user, checks each number from 1 to that integer to see if it is divisible by 3 or contains the digit 3, and if so, adds it to an ArrayList. It then prints out all the numbers in the ArrayList, separated by spaces.

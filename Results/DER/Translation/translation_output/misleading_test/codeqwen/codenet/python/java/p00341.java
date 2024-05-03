Here is the Java version of the provided Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[100];
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < 12; i++) {
            a[Integer.parseInt(input[i]) - 1] += 1;
        }
        int c = 0;
        for (int i = 0; i < 100; i++) {
            if (a[i] > 0 && a[i] % 4 == 0) {
                c += a[i] / 4;
            }
        }
        System.out.println(c == 3 ? "yes" : "no");
    }
}
```

This Java code does the same thing as the Python code. It reads a string of space-separated integers from the user, converts them to integers, and stores them in an array. It then iterates over the array, incrementing the count of each number by 1 if it's greater than 0 and divisible by 4. Finally, it checks if the count of numbers that meet the criteria is 3 and prints "yes" or "no" accordingly.

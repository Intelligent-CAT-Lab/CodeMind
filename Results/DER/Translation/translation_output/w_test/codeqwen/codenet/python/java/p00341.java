Here is the Java version of your Python code:

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

This Java code does the same thing as your Python code. It reads a string of space-separated integers from the user, converts them to integers, and stores them in an array. It then iterates over the array, incrementing the count of each number by 1. After that, it iterates over the array again, and if the count of a number is greater than 0 and is divisible by 4, it adds the count to the variable `c`. Finally, it prints "yes" if `c` is equal to 3, and "no" otherwise.

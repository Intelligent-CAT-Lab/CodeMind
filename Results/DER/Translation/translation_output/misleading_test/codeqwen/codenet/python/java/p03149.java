Here is the Java version of your Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] a = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            a[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(a);
        int[] b = {1, 4, 7, 9};
        boolean isEqual = true;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                isEqual = false;
                break;
            }
        }
        String ans = isEqual ? "YES" : "NO";
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads a line of input, splits it into an array of strings, converts each string to an integer, sorts the array, and then compares it to the array `b`. If they are equal, it prints "YES"; otherwise, it prints "NO".

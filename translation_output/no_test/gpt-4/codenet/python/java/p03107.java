Below is the Java translation of the given Python code. This Java code reads a string from the user, converts it to a character array, and then counts the occurrences of '0' and '1'. Finally, it prints twice the minimum count of '0's or '1's.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        char[] A = input.toCharArray();
        int N = A.length;

        int C0 = 0;
        int C1 = 0;

        for (char c : A) {
            if (c == '0') {
                C0++;
            } else if (c == '1') {
                C1++;
            }
        }

        System.out.println(2 * Math.min(C0, C1));
    }
}
```

Note that I've assumed that the input consists solely of '0's and '1's as per the Python code, so I didn't check for other characters in the array. Also, I've extracted the length of the array `A` into a variable `N`, as it was in the Python code, even though it is not used in this snippet.

Here is the equivalent Java code for the Python code you provided:

```java
import java.util.Scanner;

public class SpecialParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] S = input.toCharArray();
        int N = input.indexOf('*');
        int P = Math.abs(count(S, 0, N, '(') - count(S, 0, N, ')'));
        int Q = Math.abs(count(S, N + 1, S.length, '(') - count(S, N + 1, S.length, ')'));
        System.out.println(Math.min(P, Q));
    }

    private static int count(char[] array, int start, int end, char c) {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (array[i] == c) {
                count++;
            }
        }
        return count;
    }
}
```

To test this Java program with the input `((*)())` as you mentioned, you would run the program and provide the input when prompted. The expected output for this test case would be `2`.

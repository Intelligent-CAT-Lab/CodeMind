Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int n = S.length() + 1;
        int[] sho = new int[n];
        int[] dai = new int[n];

        for (int i = 0; i < S.length(); i++) {
            char s = S.charAt(i);
            i++;
            if (s == '>') {
                sho[i] = 0;
            } else {
                sho[i] = sho[i - 1] + 1;
            }
        }

        for (int i = S.length() - 1; i >= 0; i--) {
            char s = S.charAt(i);
            i = n - i - 2;
            if (s == '<') {
                dai[i] = 0;
            } else {
                dai[i] = dai[i + 1] + 1;
            }
        }

        int[] seq = new int[n];
        for (int i = 0; i < n; i++) {
            seq[i] = Math.max(sho[i], dai[i]);
        }

        int sum = 0;
        for (int i : seq) {
            sum += i;
        }

        System.out.println(sum);
    }
}
```

This Java code does the same thing as your Python code. It reads a string from the standard input, calculates the maximum number of consecutive characters in the string that are either "<" or ">", and then prints the sum of these maximum numbers.

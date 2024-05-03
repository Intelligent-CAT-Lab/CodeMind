Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine().trim();
        int N = S.length();
        int ans = N;
        int ans2 = N;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == '1') {
                ans = Math.min(ans, Math.max(N - i - 1, i));
            } else {
                ans2 = Math.min(ans2, Math.max(N - i - 1, i));
            }
        }
        System.out.println(Math.max(ans, ans2));
    }
}
```

This Java code does the same thing as the Python code. It reads a string from the standard input, calculates the length of the string, and then iterates over the string to find the minimum distance to the nearest '1'. It keeps track of two minimum distances, one for the first '1' it encounters and one for the last '1' it encounters. Finally, it prints the maximum of these two distances.

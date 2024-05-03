Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(aaa(0, N));
    }

    public static int aaa(int n, int N) {
        if (n > N) {
            return 0;
        }
        Set<Character> set = new HashSet<>();
        while (n > 0) {
            set.add((char) ('0' + n % 10));
            n /= 10;
        }
        boolean is753 = set.contains('7') && set.contains('5') && set.contains('3');
        int ans = is753 ? 1 : 0;
        for (char i : "753".toCharArray()) {
            ans += aaa(n * 10 + i - '0', N);
        }
        return ans;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calls the `aaa` function with the initial value of `n` as 0 and the maximum value of `N` as the user's input. The `aaa` function checks if the current number `n` is greater than `N`, if so, it returns 0. Otherwise, it checks if the set of digits in `n` contains the digits 7, 5, and 3. If it does, it increments the answer by 1. Then, it iterates over the digits 7, 5, and 3, and recursively calls the `aaa` function with `n` incremented by the current digit. The final answer is printed to the console.

Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;

public class CoinCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        int n = scanner.nextInt();
        int ans = 0;
        int[] coins = {25, 10, 5, 1};

        // Loop through each coin denomination and calculate the number of coins
        for (int x : coins) {
            ans += n / x;
            n %= x;
        }

        // Print the result
        System.out.println(ans);

        scanner.close();
    }
}
```

When writing this code in Java, keep in mind the following:

1. Java is strongly typed, so we need to declare the type of each variable.
2. Use `Scanner` to read input from the user as Java does not have a built-in function like Python's `input()`.
3. For the for-each loop, I used an array to hold the coin denominations instead of a tuple.
4. To print the result, `System.out.println()` is used in Java.

Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int ans = 0;
        int[] coins = {25, 10, 5, 1};
        for (int x : coins) {
            ans += n / x;
            n %= x;
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then calculates the number of coins needed to make up that amount. It uses an array to store the values of the coins, then iterates over this array, dividing the remaining amount by each coin value and adding the result to the answer. The remainder is then calculated and used for the next iteration. Finally, the answer is printed to the console.

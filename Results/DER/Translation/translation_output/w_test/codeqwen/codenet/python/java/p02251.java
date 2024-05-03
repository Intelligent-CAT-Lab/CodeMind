Here is the Java version of the provided Python code:

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

This Java code does the same thing as the Python code. It reads an integer from the user, then calculates the number of coins needed to make up that amount. The coins used are 25, 10, 5, and 1 cents. The number of each coin needed is calculated by dividing the total amount by the coin value and then taking the remainder. This process is repeated for each coin type. The total number of coins needed is then printed to the console.

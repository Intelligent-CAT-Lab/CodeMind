Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int ans = 1, k = 0;
        for (int i = 2; i <= N; i += 2) {
            int temp = i, res = 0;
            while (temp % 2 == 0) {
                res += 1;
                temp /= 2;
            }
            if (k < res) {
                ans = i;
                k = res;
            }
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the user, then iterates over all even numbers up to and including that integer. For each even number, it calculates the number of times it can be divided by 2 (i.e., the number of times it has even factors) and keeps track of the largest number and the largest count of even factors seen so far. Finally, it prints the largest number with the largest count of even factors.

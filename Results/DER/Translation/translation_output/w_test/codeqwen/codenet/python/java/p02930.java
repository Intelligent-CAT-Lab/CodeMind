Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                int x = i ^ j;
                int ct = 0;
                while (x > 0) {
                    x >>= 1;
                    ct += 1;
                }
                System.out.print(ct + " ");
            }
            System.out.println("");
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, then it uses two nested loops to iterate over all pairs of numbers from 0 to the input number. For each pair, it calculates the bitwise XOR of the pair, then counts the number of 1s in the binary representation of the XOR result. It prints this count followed by a space. After printing all counts for a pair, it prints a newline.

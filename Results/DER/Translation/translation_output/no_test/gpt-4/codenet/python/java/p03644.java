Below is the Java equivalent of the provided Python code snippet:

```java
import java.util.Scanner;

public class EvenDivision {

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
        scanner.close();
    }
}
```

This Java code reads an integer input from the user, just like in Python, and performs the same calculation to find an even number from 2 to N inclusive, having the maximum number of 2's dividing it without leaving a remainder. The answer is then printed to the console.

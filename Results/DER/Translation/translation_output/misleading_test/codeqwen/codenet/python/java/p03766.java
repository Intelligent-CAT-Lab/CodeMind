Here is the Java version of the provided Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n == 1) {
            System.out.println(1);
        } else {
            int[] resV = new int[n + 1];
            int[] resVCumsum = new int[n + 1];
            resV[0] = 0;
            resV[1] = 1;
            resV[2] = 1;
            resVCumsum[0] = 0;
            resVCumsum[1] = 1;
            resVCumsum[2] = 2;

            int M = 1000000007;

            for (int k = 3; k < n; k++) {
                resV[k] = (1 + resVCumsum[k - 1] - resV[k - 2]) % M;
                resVCumsum[k] = (resVCumsum[k - 1] + resV[k]) % M;
            }
            //System.out.println(Arrays.toString(resV));
            System.out.println((((resVCumsum[n - 2] * (((n - 1) * (n - 1)) % M)) % M) + ((resVCumsum[n - 1] * (n - 1)) % M) + n + (n - 1) * (n - 1) % M) % M);
        }
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the user, calculates the result based on the rules provided in the code, and prints the result.

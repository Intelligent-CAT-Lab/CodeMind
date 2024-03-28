Here is the translated Java code for the given Python code. The Java code performs the same task of prime factorization and then calculates the specified output based on the provided input.

```java
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();
        scanner.close();

        List<int[]> factors = factorization(p);
        int ans = 1;
        for (int[] factor : factors) {
            if (factor[1] >= n) {
                ans *= Math.pow(factor[0], factor[1] / n);
            }
        }
        System.out.println(ans);
    }

    private static List<int[]> factorization(int n) {
        List<int[]> arr = new ArrayList<int[]>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new int[]{i, cnt});
            }
        }

        if (temp != 1) {
            arr.add(new int[]{temp, 1});
        }

        if (arr.isEmpty()) {
            arr.add(new int[]{n, 1});
        }

        return arr;
    }
}
```

This Java code reads two integers `n` and `p` from standard input, runs the factorization of `p`, and then outputs the calculation result as specified in the Python program. The `factorization` method returns a list of `int` arrays where each array contains two elements—the prime factor and its exponent. The main method then calculates the answer based on the exponents and the value of `n`, and prints it to standard output.

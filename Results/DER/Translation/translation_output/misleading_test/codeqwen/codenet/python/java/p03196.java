Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        ArrayList<int[]> l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1] >= n) {
                ans *= (int) Math.pow(l.get(i)[0], l.get(i)[1] / n);
            }
        }
        System.out.println(ans);
    }

    public static ArrayList<int[]> factorization(int n) {
        ArrayList<int[]> arr = new ArrayList<>();
        int temp = n;
        for (int i = 2; i <= Math.sqrt(n); i++) {
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

This Java code does the same thing as the Python code. It reads two integers from the standard input, calculates the factorization of the second integer, and then prints the result. The `factorization` method is the same as the Python method, but it uses Java's `ArrayList` instead of Python's list and `Math.pow` instead of Python's `**`.

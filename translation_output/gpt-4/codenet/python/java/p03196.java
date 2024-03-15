Below is the Python code translated to Java:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int p = scanner.nextInt();

        ArrayList<int[]> l = factorization(p);
        int ans = 1;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i)[1] >= n) {
                ans *= Math.pow(l.get(i)[0], l.get(i)[1] / n);
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

Please note the following differences between Python and Java:

1. Java's strict typing requires us to declare variable types.
2. Java uses `ArrayList` to create dynamic arrays, and `int[]` to store pairs.
3. In Java, `Math.pow()` returns a `double`, so we should cast it back to `int` after the computation (if the context allows for the assumption that the result fits into an `int`).
4. To read input, we use `Scanner` in Java.
5. Java requires a class and `main` method as an entry point for the program.

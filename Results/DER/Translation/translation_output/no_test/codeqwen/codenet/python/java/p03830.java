Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(main());
    }

    public static int main() {
        int n = sc.nextInt();
        Map<Integer, Integer> d = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            for (Map.Entry<Integer, Integer> entry : factorization(i).entrySet()) {
                d.put(entry.getKey(), d.getOrDefault(entry.getKey(), 0) + entry.getValue());
            }
        }
        int r = 1;
        for (int c : d.values()) {
            r *= c + 1;
            r %= 1000000007;
        }
        return r;
    }

    public static Map<Integer, Integer> factorization(int n) {
        Map<Integer, Integer> result = new HashMap<>();
        int m = n;
        for (int x = 2; m >= x * x; x += 6) {
            int c = 0;
            while (m % x == 0) {
                c++;
                m /= x;
            }
            if (c > 0) {
                result.put(x, c);
            }
        }
        if (m > 1) {
            result.put(m, 1);
        }
        return result;
    }

    static Scanner sc = new Scanner(System.in);
}
```

Please note that Java does not have a built-in function to read input from the console like Python does with `input()`. Therefore, I've added a `Scanner` object `sc` to read input from the console. You can use `sc.nextInt()` to read an integer from the console.

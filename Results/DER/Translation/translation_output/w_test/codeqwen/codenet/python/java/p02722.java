Here is the Java version of your Python code:

```java
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int k = Integer.parseInt(System.console().readLine());
        Set<Integer> setl = new HashSet<>();
        setl.add(k);
        setl.add(k - 1);
        for (int x = 2; x <= Math.sqrt(k); x++) {
            check(x, k, setl);
            check(k / x, k, setl);
        }
        if (setl.contains(1)) {
            setl.remove(1);
        }
        System.out.println(setl.size());
    }

    public static void check(int i, int k, Set<Integer> setl) {
        int tot = k;
        while (tot % i == 0) {
            tot /= i;
        }
        if (tot % i == 1) {
            setl.add(i);
        }
    }
}
```

This Java code does the same thing as your Python code. It reads an integer from the console, adds it to a set, and then checks if it's divisible by any number up to the square root of the input number. If it is, it adds that number to the set. If it's not, it continues to the next number. If the number is 1, it removes it from the set. Finally, it prints the size of the set.

Here is the equivalent Java code for the provided Python script:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Factorization {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long x = scanner.nextLong();
        List<Pair> l = factorization(x);
        Collections.sort(l);
        
        int ans = 0;
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i).key == 1) {
                continue;
            } else {
                int s = 0;
                int num = l.get(i).value;
                int j = 1;
                if (num != 1) {
                    for (j = 1; j < num; j++) {
                        s += j;
                        if (s == num) {
                            break;
                        } else if (s > num) {
                            j--;
                            break;
                        }
                    }
                }
                ans += j;
            }
        }
        System.out.println(ans);
        scanner.close();
    }

    public static List<Pair> factorization(long n) {
        List<Pair> arr = new ArrayList<>();
        long temp = n;
        for (int i = 2; i <= (int) Math.sqrt(n) + 1; i++) {
            if (temp % i == 0) {
                int cnt = 0;
                while (temp % i == 0) {
                    cnt++;
                    temp /= i;
                }
                arr.add(new Pair(i, cnt));
            }
        }
        if (temp != 1) {
            arr.add(new Pair(temp, 1));
        }
        if (arr.isEmpty()) {
            arr.add(new Pair(n, 1));
        }
        return arr;
    }
    
    static class Pair implements Comparable<Pair> {
        long key;
        int value;
        
        Pair(long key, int value) {
            this.key = key;
            this.value = value;
        }
        
        @Override
        public int compareTo(Pair other) {
            return Long.compare(this.key, other.key);
        }
    }
}
```

Please note the following translations and considerations:
- The function `input()` is equivalent to Java's `Scanner` functionality for reading user input.
- The method `factorization()` returns `List<Pair>` which is a list of `Pair` objects, a custom class to handle pairs like Python tuples.
- Integer division (`//`) is by default in Java when dividing two integers.
- The square root of `n` (`n**0.5`) is calculated using `Math.sqrt(n)`.
- Lists in Java do not have a `.sort()` method; we utilize `Collections.sort()` instead.
- Java does not have an equivalent of Python's list comprehension, so the operations involved in sorting and other list operations are done using loops and the `add()` method.
- No explicit type declarations are needed for variables as in Python; Java requires type specification.

The above Java code assumes the input is non-negative. If negative value handling is required, adjustments would need to be made to the program logic.

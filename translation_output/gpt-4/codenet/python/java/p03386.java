Here's the equivalent Java code for the provided Python snippet:

```java
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int K = scanner.nextInt();
        scanner.close();
        
        Set<Integer> ans = new TreeSet<>(); // TreeSet is sorted and doesn't allow duplicates

        for (int p = A; p <= A + K - 1 && p <= B; p++) {
            ans.add(p);
        }

        for (int q = B - K + 1; q <= B && q >= A; q++) {
            ans.add(q);
        }

        for (Integer i : ans) {
            System.out.println(i);
        }
    }
}
```

Some important notes about this translation:

1. Java has a strong type system, which means we must declare the type of each variable.
2. We use a `Scanner` to read input from stdin, similar to Python's `input().split()`.
3. Instead of list comprehensions as in Python, we use for-loops to add elements to the collection.
4. A `TreeSet` in Java automatically sorts the elements and ensures uniqueness, hence we don't need to call sort separately or convert a list to a set for uniqueness.
5. We don't have to explicitly convert the `TreeSet` to a list before iterating it. We can directly iterate through the `TreeSet`.

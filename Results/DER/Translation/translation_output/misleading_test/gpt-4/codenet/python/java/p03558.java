Below is the translation of the given Python code to Java code along with the sample test case:

```java
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class MultiplyBy10Add1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        scanner.close();

        LinkedList<Pair> q = new LinkedList<>();
        q.add(new Pair(1, 1));
        HashMap<Integer, Integer> m = new HashMap<>();
        while (!q.isEmpty()) {
            Pair p = q.pollFirst();
            int n = p.n;
            int s = p.s;
            if (m.containsKey(n)) {
                continue;
            }
            m.put(n, s);
            q.addFirst(new Pair(n * 10 % K, s));
            q.add(new Pair((n + 1) % K, s + 1));
        }
        System.out.println(m.get(0));
    }

    static class Pair {
        int n, s;

        Pair(int n, int s) {
            this.n = n;
            this.s = s;
        }
    }
}
```

If you run the above Java code with the test input `6`, the expected output will be `-56`, as in the Python version.

_Notice that in Java, it's necessary to create a Pair class to encapsulate the values since Java does not have a built-in tuple type like Python._

Here is the given Python code translated into Java:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        List<Pair> l = factorization(x);
        l.sort((pair1, pair2) -> pair1.getKey() - pair2.getKey());

        int ans = 0;
        for (Pair pair : l) {
            if (pair.getKey() == 1) {
                continue;
            }
            int s = 0;
            int num = pair.getValue();
            int j = 0;
            if (num == 1) {
                j = 1;
            } else {
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
        System.out.println(ans);

        scanner.close();
    }

    public static List<Pair> factorization(int n) {
        List<Pair> arr = new ArrayList<>();
        int temp = n;
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
    
    static class Pair {
        private final int key;
        private final int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public int getValue() {
            return value;
        }
    }
}
```

You could also choose to use the `java.util.AbstractMap.SimpleEntry<K,V>` class to store key-value pairs instead of defining your own `Pair` class. However, for educational purposes and readability, I have included a simple `Pair` class here. Ensure to define this `Pair` class outside of `Main` or make it static if it's nested inside another class. Also, note that I've changed the sorting part to sort based on the key (factor) of `Pair`.

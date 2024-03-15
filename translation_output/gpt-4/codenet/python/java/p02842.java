Below is the Python code translated into Java code. Remember that in Java, we usually take input via `Scanner` and output using `System.out.println`. Also, to mimic the dictionary from Python, we use a `HashMap` in Java.

```java
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        HashMap<Integer, Integer> dic = new HashMap<>();
        for (int i = 1; i <= 50000; i++) {
            int p = (int) (i * 1.08);
            dic.put(p, i);
        }
        if (dic.containsKey(n)) {
            System.out.println(dic.get(n));
        } else {
            System.out.println(":(");
        }
    }
}
```

This Java code follows the same logic as the Python code:

- A `HashMap` is used to store the integer `p` (the result of `i*1.08`) as the key and `i` as the value.
- User input is taken as an integer `n` using a `Scanner`.
- A for loop runs from 1 to 50000 inclusive, calculating `p` and storing it with `i` in the `HashMap`.
- Finally, we check if `n` is a key in the `HashMap`. If it is, we output the corresponding value; if not, we print ":(".

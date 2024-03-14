<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, k = map(int, input().split())

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])

```

### Response:
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int k = scanner.nextInt();

        List<Integer> res = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }

        Collections.sort(res, Collections.reverseOrder());
        System.out.println(res.get(k - 1));
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the standard input, finds all common divisors of the two input integers, sorts them in descending order, and prints the k-th largest divisor.
<|EOT|>

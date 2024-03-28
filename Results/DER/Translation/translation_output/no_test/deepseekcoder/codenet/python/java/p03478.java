<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
	n_orders_sum = 0
	for n_order_i in str(n_i):
		n_orders_sum += int(n_order_i)
	if a <= n_orders_sum and n_orders_sum <= b:
		sum += n_i
print(sum)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int n_i = 1; n_i <= n; n_i++) {
            int n_orders_sum = 0;
            for (char n_order_i : Integer.toString(n_i).toCharArray()) {
                n_orders_sum += Character.getNumericValue(n_order_i);
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }
        System.out.println(sum);
    }
}
```

This Java code does the same thing as the Python code. It reads three integers from the input, then calculates the sum of all numbers from 1 to `n` (inclusive) that have a digit sum between `a` and `b` (inclusive). The digit sum is calculated by converting each digit of the number to an integer and summing them.
<|EOT|>

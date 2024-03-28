Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
84


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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            for (char c : String.valueOf(i).toCharArray()) {
                n_orders_sum += Character.getNumericValue(c);
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```<|endoftext|>

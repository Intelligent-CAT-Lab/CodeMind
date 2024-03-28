<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
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
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, a, b;
        n = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        int sum = 0;
        for (int n_i = 1; n_i <= n; n_i++) {
            int n_orders_sum = 0;
            for (int n_order_i = 1; n_order_i <= n_i; n_order_i++) {
                n_orders_sum += n_order_i;
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += n_i;
            }
        }
        System.out.println(sum);
    }
}
```</s>

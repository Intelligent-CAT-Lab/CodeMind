System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
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


Answer:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int sumOfDigits = 0;
            int temp = i;
            while (temp > 0) {
                sumOfDigits += temp % 10;
                temp /= 10;
            }
            if (sumOfDigits >= a && sumOfDigits <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```

Test input:
20 2 5

Expected output:
84<|endoftext|>

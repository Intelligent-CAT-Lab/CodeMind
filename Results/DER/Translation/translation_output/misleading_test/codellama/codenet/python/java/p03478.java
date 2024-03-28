<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
20 2 5

Expected output:
29

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

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(i).charAt(j) + "");
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `String` and `Integer` classes to convert the input to integers and perform the necessary calculations. The `for` loop iterates over the range of numbers from 1 to `n`, and the nested `for` loop iterates over the digits of each number and calculates the sum of the digits. If the sum of the digits is between `a` and `b`, the number is added to the sum. Finally, the sum is printed to the console.</s>

<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

n, a, b = map(int, input().split())

sum = 0
for n_i in range(1, n + 1):
	n_orders_sum = 0
	for n_order_i in str(n_i):
		n_orders_sum += int(n_order_i)
	if a <= n_orders_sum and n_orders_sum <= b:
		sum += n_i
print(sum)


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int n_orders_sum = 0;
            for (int j = 0; j < String.valueOf(i).length(); j++) {
                n_orders_sum += Integer.parseInt(String.valueOf(i).charAt(j));
            }
            if (a <= n_orders_sum && n_orders_sum <= b) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
Note that in Java, we use the `Scanner` class to read input from the user, and we use the `String.valueOf(i).length()` method to get the length of the string representation of `i`. We also use the `String.valueOf(i).charAt(j)` method to get the `j`-th character of the string representation of `i`.</s>

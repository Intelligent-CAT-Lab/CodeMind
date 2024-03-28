<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 6

Expected output:
-43

```
K, A, B = [int(elem) for elem in input().split()]

if B - A <= 2:
    print(K + 1)
else:
    first_num_exchanges = A + 1
    rest_num_exchanges = K - first_num_exchanges
    gain_per_two_manipulation = B - A
    num_cookies = rest_num_exchanges // 2 * gain_per_two_manipulation + B
    if rest_num_exchanges % 2 == 1:
        num_cookies += 1
    print(num_cookies)

```
[/INST]
```java
import java.util.Scanner;

public class CookieManipulation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int firstNumExchanges = A + 1;
            int restNumExchanges = K - firstNumExchanges;
            int gainPerTwoManipulation = B - A;
            int numCookies = restNumExchanges / 2 * gainPerTwoManipulation + B;
            if (restNumExchanges % 2 == 1) {
                numCookies += 1;
            }
            System.out.println(numCookies);
        }
    }
}
```
This code uses the `Scanner` class to read input from the user, and then it uses the `if-else` statement to check if the number of manipulations is less than or equal to 2. If it is, it prints the result of adding 1 to the number of cookies. Otherwise, it calculates the number of cookies that can be obtained by manipulating the cookies in pairs, and then it prints the total number of cookies.</s>

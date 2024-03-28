<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following python code to java and enclose your solution inside ```java```:
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

@@ Response
```java
import java.util.Scanner;

public class Main {
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
```<｜end▁of▁sentence｜>

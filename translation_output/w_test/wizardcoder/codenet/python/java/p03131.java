Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 2 6

Expected output:
7


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

### Response:
```java
import java.util.Scanner;

public class CookieExchange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        if (B - A <= 2) {
            System.out.println(K + 1);
        } else {
            int first_num_exchanges = A + 1;
            int rest_num_exchanges = K - first_num_exchanges;
            int gain_per_two_manipulation = B - A;
            int num_cookies = rest_num_exchanges / 2 * gain_per_two_manipulation + B;
            if (rest_num_exchanges % 2 == 1) {
                num_cookies += 1;
            }
            System.out.println(num_cookies);
        }
    }
}
```<|endoftext|>

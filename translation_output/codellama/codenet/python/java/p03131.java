<s> [INST] <<SYS>>
You are an expert java programmer and assistant
<</SYS>>

python code:

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


Translate the above python code to java.

java code:

[/INST]

Here is the Java code equivalent to the Python code:
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
Note that the Java code uses the `Scanner` class to read input from the user, and the `System.out.println()` method to print output to the console. The `if` statement is used to check if the number of cookies gained per two manipulations is less than or equal to 2, and if so, the number of cookies is simply the number of manipulations plus 1. Otherwise, the number of cookies is calculated using the formula `restNumExchanges / 2 * gainPerTwoManipulation + B`, where `restNumExchanges` is the number of manipulations minus the first manipulation, `gainPerTwoManipulation` is the number of cookies gained per two manipulations, and `B` is the number of cookies at the end of the manipulations. If the number of manipulations is odd, an additional cookie is added to the total number of cookies.</s>

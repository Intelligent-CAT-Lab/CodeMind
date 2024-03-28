Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
63

```
def gcd(a, b):
    '''ã¦ã¼ã¯ãªããäºé¤æ³ãä½¿ã£ãæå¤§å¬ç´æ°ã®æ±ãæ¹'''
    while b!= 0:
        a, b = b, a % b
    return(a)


def lcm(a, b):
    '''æå°å¬åæ°ã®æ±ãæ¹'''
    return a * b // gcd(a, b)

A, B = list(map(int, input().split()))

print(lcm(A,B))
```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();

        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        int lcm = (a * b) / gcd;

        System.out.println(lcm);
    }
}
```<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 3

Expected output:
6


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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b/gcd(a,b));
    }

    public static int gcd(int a, int b) {
        while (b!= 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }
}
```
<|endoftext|>

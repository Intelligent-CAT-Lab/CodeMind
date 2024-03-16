<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = gcd(a, b);
        System.out.println(a * b / gcd);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```
<|endoftext|>

Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 9 2 3

Expected output:
98

```
import math
def readinput():
    a,b,c,d=map(int,input().split())
    return a,b,c,d

def main(a,b,c,d):
    lcm=c*d//math.gcd(c,d)
    #print(lcm)
    return b-a+1 - ( b//c-(a-1)//c + b//d-(a-1)//d - ( b//lcm - (a-1)//lcm ) )


if __name__=='__main__':
    a,b,c,d=readinput()
    ans=main(a,b,c,d)
    print(ans)

```

### Response:
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int lcm = c * d / gcd(c, d);
        int ans = b - a + 1 - (b / c - (a - 1) / c + b / d - (a - 1) / d - (b / lcm - (a - 1) / lcm));
        System.out.println(ans);
    }

    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}
```<|endoftext|>

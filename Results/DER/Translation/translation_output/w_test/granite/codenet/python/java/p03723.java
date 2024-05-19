System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 12 20

Expected output:
3


```
import math
import sys


def rem(a, b, c):
    if a % 2!= 0 or b % 2!= 0 or c % 2!= 0:
        return False
    else:
        return True
def isDouble(a, b, c):
    if (a%1!=0 or b%1!=0 or c%1!=0):
        return False
    else:
        return True
a, b, c = map(int, input().split())
cnt = 0
fa = a
fb = b
fc=c
while True:
    if (cnt!= 0 and fa == a and fb == b and fc == c):
        print(-1)
        sys.exit()
    tmp1 = a / 2
    tmp2 = b / 2
    tmp3 = c / 2
    if (not isDouble(tmp1, tmp2, tmp3)):
        break
    cnt += 1
    a = tmp2 + tmp3
    b = tmp1 + tmp3
    c = tmp1 + tmp2
    if (not rem(a, b, c)):
        break
print(cnt)

```


Answer:
```java
import java.util.*;

public class Main {
    public static boolean rem(int a, int b, int c) {
        if (a % 2!= 0 || b % 2!= 0 || c % 2!= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isDouble(int a, int b, int c) {
        if (a % 1!= 0 || b % 1!= 0 || c % 1!= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        int fa = a;
        int fb = b;
        int fc = c;
        while (true) {
            if (cnt!= 0 && fa == a && fb == b && fc == c) {
                System.out.println(-1);
                System.exit(0);
            }
            int tmp1 = a / 2;
            int tmp2 = b / 2;
            int tmp3 = c / 2;
            if (!isDouble(tmp1, tmp2, tmp3)) {
                break;
            }
            cnt += 1;
            a = tmp2 + tmp3;
            b = tmp1 + tmp3;
            c = tmp1 + tmp2;
            if (!rem(a, b, c)) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
```<|endoftext|>

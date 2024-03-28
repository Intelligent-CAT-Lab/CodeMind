<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int cnt = 0;
        while (true) {
            if (cnt!= 0 && a == a && b == b && c == c) {
                System.out.println(-1);
                return;
            }
            int tmp1 = a / 2;
            int tmp2 = b / 2;
            int tmp3 = c / 2;
            if (tmp1 % 1!= 0 || tmp2 % 1!= 0 || tmp3 % 1!= 0) {
                break;
            }
            cnt++;
            a = tmp2 + tmp3;
            b = tmp1 + tmp3;
            c = tmp1 + tmp2;
            if (a % 2!= 0 || b % 2!= 0 || c % 2!= 0) {
                break;
            }
        }
        System.out.println(cnt);
    }
}
```
<|endoftext|>

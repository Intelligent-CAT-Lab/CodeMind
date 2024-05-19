System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
```
n, p = list(map(int, input().split()))

if n == 1 :
    print(p)
elif p == 1 :
    print(1)
elif n >= 40:
    print(1)
else:
    ans = 1
    count = 2
    tmp = count**n
    while (tmp) <= p:
        if(p % tmp == 0):
            ans *= count
            p = int(p/tmp)
            count -= 1
        count += 1
        tmp = count**n
    print(ans)
```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();

        if (n == 1) {
            System.out.println(p);
        } else if (p == 1) {
            System.out.println(1);
        } else if (n >= 40) {
            System.out.println(1);
        } else {
            int ans = 1;
            int count = 2;
            int tmp = (int) Math.pow(count, n);
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count -= 1;
                }
                count += 1;
                tmp = (int) Math.pow(count, n);
            }
            System.out.println(ans);
        }
    }
}
```<|endoftext|>

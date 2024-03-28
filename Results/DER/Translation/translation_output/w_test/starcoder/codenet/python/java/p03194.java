<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 24

Expected output:
2


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

java code:<fim_suffix><fim_middle>
```
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
            int tmp = count;
            while (tmp <= p) {
                if (p % tmp == 0) {
                    ans *= count;
                    p = p / tmp;
                    count -= 1;
                }
                count += 1;
                tmp = count;
            }
            System.out.println(ans);
        }
    }
}
```
<|endoftext|>

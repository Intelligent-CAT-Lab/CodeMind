<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
8 12 2

Expected output:
2


```
a, b, k = map(int, input().split())

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int k = sc.nextInt();

        int[] res = new int[100];
        for (int i = 1; i <= 100; i++) {
            if (a % i == 0 && b % i == 0) {
                res[i - 1] = i;
            }
        }

        Arrays.sort(res);
        System.out.println(res[k - 1]);
    }
}
```
<|endoftext|>

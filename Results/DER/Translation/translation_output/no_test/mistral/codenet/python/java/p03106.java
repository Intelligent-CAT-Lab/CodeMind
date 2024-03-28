<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, k = map(int, input().split())

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])

```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, k;
        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < 101; i++) {
            if (a % i == 0 && b % i == 0) {
                res.add(i);
            }
        }
        res.sort(Collections.reverseOrder());
        System.out.println(res.get(k - 1));
    }
}
```</s>

<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a, b, k = map(int, input().split())

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])

```

### Input

```
5 10 3
```

### Output

```
10
```

### Explanation

```
a = 5
b = 10
k = 3

res = []
for i in range(1, 101):
    if a % i == 0 and b % i == 0:
        res.append(i)

res.sort(reverse=True)
print(res[k-1])

```

### Code

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, k;
        a = sc.nextInt();
        b = sc.nextInt();
        k = sc.nextInt();
        int[] res = new int[100];
        for (int i = 1; i < 101; i++) {
            if (a % i == 0 && b % i == 0) {
                res[i] = i;
            }
        }
        Arrays.sort(res, Collections.reverseOrder());
        System.out.println(res[k - 1]);
    }
}
```
</s>

<s> Translate the following python code to java and enclose your solution inside ```java```:
```
l = list(map(int, input().split()))
l = sorted(l)
ans = 0
for i in range(3):
    if l[i] % 2 == 0:
        ans = 0
        break
    else:
        ans = l[0] * l[1]
print(ans)

```

### Input

```
1 2 3
```

### Output

```
6
```

### Explanation

```
l = list(map(int, input().split()))
l = sorted(l)
ans = 0
for i in range(3):
    if l[i] % 2 == 0:
        ans = 0
        break
    else:
        ans = l[0] * l[1]
print(ans)
```

### Code

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] l = new int[3];
        for (int i = 0; i < 3; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
                break;
            }
        }
        System.out.println(ans);
    }
}
```
</s>

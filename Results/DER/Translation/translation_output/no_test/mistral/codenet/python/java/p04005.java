<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int[] l = new int[split.length];
        for (int i = 0; i < split.length; i++) {
            l[i] = Integer.parseInt(split[i]);
        }
        Arrays.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l[i] % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l[0] * l[1];
            }
        }
        System.out.println(ans);
    }
}
```</s>

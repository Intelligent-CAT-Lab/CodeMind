<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l = new ArrayList<Integer>();
        for (int i = 0; i < 3; i++) {
            l.add(sc.nextInt());
        }
        Collections.sort(l);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (l.get(i) % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = l.get(0) * l.get(1);
            }
        }
        System.out.println(ans);
    }
}
```
<|endoftext|>

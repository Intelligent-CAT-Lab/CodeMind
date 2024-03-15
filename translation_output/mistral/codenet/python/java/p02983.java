<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
L, R = map(int, input().split())
if R - L > 2019:
  print(0)
else:
  l = []
  for i in range(L, R + 1):
    for j in range(i + 1, R + 1):
      l.append(i * j % 2019)
  print(min(l))
```
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R - L > 2019) {
            System.out.println(0);
        } else {
            List<Integer> l = new ArrayList<>();
            for (int i = L; i <= R; i++) {
                for (int j = i + 1; j <= R; j++) {
                    l.add(i * j % 2019);
                }
            }
            System.out.println(Collections.min(l));
        }
    }
}
```</s>

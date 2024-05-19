System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```:
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


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : input) {
            list.add(Integer.parseInt(s));
        }
        Collections.sort(list);
        int ans = 0;
        for (int i = 0; i < 3; i++) {
            if (list.get(i) % 2 == 0) {
                ans = 0;
                break;
            } else {
                ans = list.get(0) * list.get(1);
            }
        }
        System.out.println(ans);
    }
}
```<|endoftext|>

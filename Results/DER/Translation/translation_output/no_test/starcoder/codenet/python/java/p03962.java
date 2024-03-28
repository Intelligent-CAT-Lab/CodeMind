<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(len(set(list(map(int, input().split())))))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        System.out.println(set.size());
    }
}
```
<|endoftext|>

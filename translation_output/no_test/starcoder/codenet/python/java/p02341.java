<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n, k = map(int, input().split())
print(1 if n <= k else 0)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(1 if n <= k else 0);
    }
}
```
<|endoftext|>

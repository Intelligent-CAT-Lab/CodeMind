<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n, a, b, c = map(int, input().split())
print(n-(c+a-c+b-c))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(n-(c+a-c+b-c));
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
p, m, c = map(int, input().split())
print(p+m+c)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(p+m+c);
    }
}
```

'''
<|endoftext|>

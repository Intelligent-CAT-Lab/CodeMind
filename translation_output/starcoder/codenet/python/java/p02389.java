<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b = map(int, input().split())
print(a*b, (a+b)*2)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a*b);
        System.out.println((a+b)*2);
    }
}
```
<|endoftext|>

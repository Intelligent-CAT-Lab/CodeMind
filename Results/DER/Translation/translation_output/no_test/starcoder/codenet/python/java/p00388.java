<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
h, a, b = map(int, input().split())
print([(h%(a+c)==0) for c in range(b-a+1)].count(True))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = a; i <= b; i++) {
            if(h % (i + 1) == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
```
<|endoftext|>

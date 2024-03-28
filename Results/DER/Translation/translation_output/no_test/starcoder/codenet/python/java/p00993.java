<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print reduce( lambda x, y: x*y, [ x for x in range(1, 1501) ] )+2
for i in range(1, int(raw_input())+1): print i+1
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.stream(new int[1500]).reduce(1, (x, y) -> x * y) + 2);
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sc.nextInt(); i++) {
            System.out.println(i + 1);
        }
    }
}
```
<|endoftext|>

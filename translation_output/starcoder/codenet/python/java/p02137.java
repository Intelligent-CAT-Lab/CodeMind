<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(int(int(input()) // 500 * 500))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(Math.floorDiv(sc.nextInt(), 500) * 500);
    }
}
```
<|endoftext|>

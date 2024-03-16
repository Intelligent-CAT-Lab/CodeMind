<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
print(len(bin(n)) - 2 if n else 0)

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Integer.toBinaryString(n).length() - 2);
    }
}
```
<|endoftext|>

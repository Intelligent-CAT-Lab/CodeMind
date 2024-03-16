<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n = int(input())
s = 180 * (n - 2)
print(s)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int s = 180 * (n - 2);
        System.out.println(s);
    }
}
```

'''
<|endoftext|>

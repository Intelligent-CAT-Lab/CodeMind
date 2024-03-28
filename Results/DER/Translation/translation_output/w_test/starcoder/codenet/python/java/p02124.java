<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0

Expected output:
ai1333


```
print("ai1333" + "3" * int(int(input()) / 100))

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ai1333" + "3" * (int)(int(sc.next()) / 100));
    }
}
```

'''
<|endoftext|>

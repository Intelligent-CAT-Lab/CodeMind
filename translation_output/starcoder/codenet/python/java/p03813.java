<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a = int(input())
print('ABC' if a<1200 else 'ARC')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("ABC" if a<1200 else "ARC");
    }
}
```
'''
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(str(input())[:-8])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next().substring(0, sc.next().length() - 8));
    }
}
```
<|endoftext|>

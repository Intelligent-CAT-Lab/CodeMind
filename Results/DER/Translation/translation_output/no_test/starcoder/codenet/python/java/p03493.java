<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
print(input().count('1'))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.length() - s.replace("1", "").length());
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s = input()
print(s[:4] +'' + s[4:])
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
```
<|endoftext|>

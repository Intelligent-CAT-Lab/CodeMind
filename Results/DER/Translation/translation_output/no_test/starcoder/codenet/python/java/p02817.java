<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
S, T = input().split()

print(T + S)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        System.out.println(t + s);
    }
}
```

'''
<|endoftext|>

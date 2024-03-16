<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s, c = map(int, input().split())

print(s + ((c-s*2)//4)) if s * 2 <= c else print(c//2)
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(s + ((c-s*2)//4)) if s * 2 <= c else System.out.println(c//2);
    }
}
```
<|endoftext|>

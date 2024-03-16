<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,x = map(int, input().split())
print('YES' if a<=x and a+b>=x else 'NO')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(a<=x && a+b>=x? "YES" : "NO");
    }
}
```
<|endoftext|>

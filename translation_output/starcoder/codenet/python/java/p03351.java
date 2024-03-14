<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d=map(int, input().split())
print("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2])
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("YNeos"[!(Math.abs(a-c)<=d || Math.abs(a-b)<=d && Math.abs(b-c)<=d)]);
    }
}
```
<|endoftext|>

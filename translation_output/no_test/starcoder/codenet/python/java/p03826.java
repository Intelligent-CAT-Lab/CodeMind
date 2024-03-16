<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d = map(int, input().split())
s = a*b
t = c*d
if s > t: print(s)
else: print(t)
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
        int s = a*b;
        int t = c*d;
        if(s>t) System.out.println(s);
        else System.out.println(t);
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split()
a=int(a)
b=int(b)

if 0<a and a<10 and 0<b and b<10:
    print(a*b)
else:
    print("-1")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        if(0<a && a<10 && 0<b && b<10)
            System.out.println(a*b);
        else
            System.out.println("-1");
    }
}
```
<|endoftext|>

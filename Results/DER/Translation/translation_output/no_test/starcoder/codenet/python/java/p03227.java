<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()==2)
            System.out.println(s);
        else
            System.out.println(new StringBuilder(s).reverse());
    }
}
```
<|endoftext|>

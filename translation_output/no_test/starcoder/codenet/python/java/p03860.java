<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,x,C=input().split()
print("A"+x[0]+"C")

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String x=sc.next();
        String C=sc.next();
        System.out.print("A"+x.charAt(0)+"C");
    }
}
```
<|endoftext|>

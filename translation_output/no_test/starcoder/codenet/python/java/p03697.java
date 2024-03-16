<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        System.out.println(a+b);
        if(a+b>=10)
            System.out.println("error");
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a=input()
e=a.count("+")
f=a.count("-")
print(e-f)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        int e=0,f=0;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='+')
                e++;
            else
                f++;
        }
        System.out.println(e-f);
    }
}
```
<|endoftext|>

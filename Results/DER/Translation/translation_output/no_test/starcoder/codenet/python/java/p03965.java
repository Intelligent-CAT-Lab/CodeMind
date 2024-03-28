<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
print(len(s)//2-s.count('p'))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(s.length()/2-s.replaceAll("p","").length());
    }
}
```
<|endoftext|>

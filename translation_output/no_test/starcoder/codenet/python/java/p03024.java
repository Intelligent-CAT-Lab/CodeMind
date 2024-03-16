<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
x=input()
a=0
for i in x:
  if i=='x':
    a+=1
print(["NO","YES"][a<=7])
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='x')
                count++;
        }
        System.out.println(count<=7?"YES":"NO");
    }
}
```
<|endoftext|>

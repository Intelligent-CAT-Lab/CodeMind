<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
i=c=p=0;b=''
while i<len(s):
    if s[i]==b:
        if c > p:r=b;p=c
        c=0
    b=s[i]
    i+=[3,7][s[i]=='c']
    c+=1
if c>p:r=b
print(['chicken','egg'][r=='e'])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int i=0,c=0,p=0,r='c';
        while(i<s.length()){
            if(s.charAt(i)==r){
                if(c>p)r=s.charAt(i);
                p=c;
            }
            i+=s.charAt(i)=='c'?3:7;
            c++;
        }
        System.out.println(r=='e'?"egg":"chicken");
    }
}
```
<|endoftext|>

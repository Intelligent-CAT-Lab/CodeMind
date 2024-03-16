<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
dic={'a':0,'b':0,'c':0}
for c in s:
    dic[c]+=1
a,b,c=dic.values()
print('YES' if max(abs(a-b),abs(b-c),abs(c-a))<=1 else 'NO')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int a=0,b=0,c=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a') a++;
            else if(ch=='b') b++;
            else c++;
        }
        if(Math.max(Math.abs(a-b),Math.abs(b-c),Math.abs(c-a))<=1) System.out.println("YES");
        else System.out.println("NO");
    }
}
```
<|endoftext|>

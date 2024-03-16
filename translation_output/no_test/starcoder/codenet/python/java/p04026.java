<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
s=input()
for i in range(len(s)-1):
    if s[i]==s[i+1]:
        print(i+1,i+2)
        exit()
for i in range(len(s)-2):
    if s[i]==s[i+2]:
        print(i+1,i+3)
        exit()
print(-1,-1)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                System.out.println(i+1+" "+(i+2));
                return;
            }
        }
        for(int i=0;i<s.length()-2;i++){
            if(s.charAt(i)==s.charAt(i+2)){
                System.out.println(i+1+" "+(i+3));
                return;
            }
        }
        System.out.println("-1 -1");
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
a,b,c,d = input()
flag = 0
if(a==b and c==d):
    flag = 1
elif(a==c and b==d):
    flag = 1
elif(a==d and b==c):
    flag = 1
else:
    flag = 0
if(a==b and a==c and a==d):
    flag = 0
if(flag==1):
    print("Yes")
else:
    print("No")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String c = sc.next();
        String d = sc.next();
        int flag = 0;
        if(a.equals(b) && c.equals(d)){
            flag = 1;
        }
        else if(a.equals(c) && b.equals(d)){
            flag = 1;
        }
        else if(a.equals(d) && b.equals(c)){
            flag = 1;
        }
        else{
            flag = 0;
        }
        if(a.equals(b) && a.equals(c) && a.equals(d)){
            flag = 0;
        }
        if(flag==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
```
<|endoftext|>

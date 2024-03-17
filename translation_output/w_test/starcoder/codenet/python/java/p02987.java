<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
ASSA

Expected output:
Yes


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
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.charAt(0)==s.charAt(1) && s.charAt(2)==s.charAt(3)){
            System.out.println("Yes");
        }
        else if(s.charAt(0)==s.charAt(2) && s.charAt(1)==s.charAt(3)){
            System.out.println("Yes");
        }
        else if(s.charAt(0)==s.charAt(3) && s.charAt(1)==s.charAt(2)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
```
'''
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=map(int,input().split())
if A>=13:
  print(B)
elif 6<=A<=12:
  print(B//2)
else:
  print(0)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>=13)
            System.out.println(b);
        else if(6<=a&&a<=12)
            System.out.println(b/2);
        else
            System.out.println(0);
    }
}
```
<|endoftext|>

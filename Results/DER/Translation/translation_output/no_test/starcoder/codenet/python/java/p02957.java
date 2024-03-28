<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
A,B=map(int,input().split())
x=(A**2-B**2)/(2*(A-B))
if x%1==0:
    print(int(x))
else:
    print('IMPOSSIBLE')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=(a*a-b*b)/(2*(a-b));
        if(x%1==0)
            System.out.println(x);
        else
            System.out.println("IMPOSSIBLE");
    }
}
```
<|endoftext|>

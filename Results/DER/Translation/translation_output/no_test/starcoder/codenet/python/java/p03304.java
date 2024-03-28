<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
n,m,d=map(int,input().split())
if d>0:
  print(2*(n-d)*(m-1)/n**2)
else:
  print((m-1)/n)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int d=sc.nextInt();
        if(d>0)
            System.out.printf("%.2f",2*(n-d)*(m-1)/n/n);
        else
            System.out.printf("%.2f",(m-1)/n);
    }
}
```
<|endoftext|>

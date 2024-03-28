<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2 5 4

Expected output:
-87

```
a,b,c=map(int,input().split())
x=max(a,b,c)
y=min(a,b,c)
z=a+b+c-x-y
if (z-y)%2==0:
  print(x-z+(z-y)//2)
else:
  print(x-z+1+(z-y+1)//2)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int x=Math.max(a,Math.max(b,c));
        int y=Math.min(a,Math.min(b,c));
        int z=a+b+c-x-y;
        if((z-y)%2==0)
            System.out.println(x-z+(z-y)/2);
        else
            System.out.println(x-z+1+(z-y+1)/2);
    }
}
```
'''
<|endoftext|>

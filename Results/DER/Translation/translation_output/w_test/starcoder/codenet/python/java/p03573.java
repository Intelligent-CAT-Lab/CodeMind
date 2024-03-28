<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
5 7 5

Expected output:
7


```
a,b,c=map(int,input().split())
if a==b:
    print(c)
elif b==c:
    print(a)
else:
    print(b)
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
        if(a==b)
            System.out.println(c);
        else if(b==c)
            System.out.println(a);
        else
            System.out.println(b);
    }
}
```
<|endoftext|>

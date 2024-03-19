<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 4

Expected output:
-35

```
a,b,c=map(int,input().split())
if c<=a+b+1:
    print(b+c)
else:
    print(a+2*b+1)

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
        if(c<=a+b+1)
            System.out.println(b+c);
        else
            System.out.println(a+2*b+1);
    }
}
```
'''
<|endoftext|>

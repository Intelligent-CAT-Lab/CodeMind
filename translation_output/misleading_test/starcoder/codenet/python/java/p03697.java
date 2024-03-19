<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3

Expected output:
28

```
a,b=input().split();print([int(a)+int(b),'error'][int(a)+int(b)>=10])

```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String[] s=sc.nextLine().split(" ");
        int a=Integer.parseInt(s[0]);
        int b=Integer.parseInt(s[1]);
        System.out.println(a+b);
        if(a+b>=10)
            System.out.println("error");
    }
}
```
'''
<|endoftext|>

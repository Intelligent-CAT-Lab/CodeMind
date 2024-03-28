<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba

```
l=input()
if len(l)==2:
    print(l)
else:
    print(l[::-1])
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if(s.length()==2)
            System.out.println(s);
        else
            System.out.println(new StringBuilder(s).reverse());
    }
}
```
'''
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
6 3

Expected output:
9


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
        System.out.println(Integer.parseInt(s[0])+Integer.parseInt(s[1])<10?Integer.parseInt(s[0])+Integer.parseInt(s[1]):"error");
    }
}
```
<|endoftext|>

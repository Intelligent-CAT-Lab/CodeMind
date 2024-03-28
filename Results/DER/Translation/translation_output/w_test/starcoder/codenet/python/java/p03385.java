<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
bac

Expected output:
Yes


```
S=input()
if 'a' in S and 'b' in S and 'c' in S:
    print('Yes')
else:
    print('No')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String S=sc.next();
        if(S.contains("a") && S.contains("b") && S.contains("c"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
'''
<|endoftext|>

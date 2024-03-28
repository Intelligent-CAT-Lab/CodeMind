<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
apple

Expected output:
apples


```
s = input()
if s[-1]=='s':
    print(s+'es')
else:
    print(s+'s')
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.endsWith("s"))
            System.out.println(s+"es");
        else
            System.out.println(s+"s");
    }
}
```
'''
<|endoftext|>

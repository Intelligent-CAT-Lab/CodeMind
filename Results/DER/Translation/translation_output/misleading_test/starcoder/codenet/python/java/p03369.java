<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
oxo

Expected output:
863

```
s = input()
print(700+100*s.count("o"))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(700+100*s.length()-100*s.replace("o","").length());
    }
}
```
'''
<|endoftext|>

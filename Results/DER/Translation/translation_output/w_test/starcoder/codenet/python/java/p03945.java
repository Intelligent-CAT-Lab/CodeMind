<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
BBBWW

Expected output:
1


```
# coding: utf-8
print((lambda x:x.count('WB')+x.count('BW'))(input()))
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        System.out.println(s.replaceAll("W", "").replaceAll("B", "").length());
    }
}
```

'''
<|endoftext|>

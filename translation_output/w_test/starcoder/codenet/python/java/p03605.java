<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
29

Expected output:
Yes


```
if '9' in input():
    print('Yes')
else:
    print('No')
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s.contains("9"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
'''
<|endoftext|>

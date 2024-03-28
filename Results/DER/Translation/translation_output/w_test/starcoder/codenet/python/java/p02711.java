<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
117

Expected output:
Yes


```
N = input()

if "7" in N:
    print("Yes")
else:
    print("No")
```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        if(N.contains("7"))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
```
'''
<|endoftext|>

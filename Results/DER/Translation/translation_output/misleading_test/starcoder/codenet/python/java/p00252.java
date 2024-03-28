<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1

Expected output:
Op]n

```
B = input()

O = ["1 1 0", "0 0 1"]

if B in O :
    print("Open")
else :
    print("Close")


```

java code:<fim_suffix><fim_middle>

```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.next();
        String[] O = {"1 1 0", "0 0 1"};
        if (Arrays.asList(O).contains(B)) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
```

'''
<|endoftext|>

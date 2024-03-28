<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
4 5

Expected output:
unsa)fe

```
s, w = map(int, input().split())

if w >= s :
    print("unsafe")
else:
    print("safe")
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int w = sc.nextInt();
        if (w >= s) {
            System.out.println("unsafe");
        } else {
            System.out.println("safe");
        }
    }
}
```

'''
<|endoftext|>

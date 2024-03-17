<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 2 6

Expected output:
1


```
w, a, b = map(int, input().split())

if abs(a-b) < w:
    print(0)
else:
    print(abs(a-b) - w)
```

java code:<fim_suffix><fim_middle>
```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int w = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (Math.abs(a-b) < w) {
            System.out.println(0);
        } else {
            System.out.println(Math.abs(a-b) - w);
        }
    }
}
```
'''
<|endoftext|>

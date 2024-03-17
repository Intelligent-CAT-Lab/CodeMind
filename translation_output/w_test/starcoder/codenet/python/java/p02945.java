<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
-13 3

Expected output:
-10


```
a, b=map(int, input().split())
print(max(a-b, a+b, a*b))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(Math.max(a-b, a+b, a*b));
    }
}
```
<|endoftext|>

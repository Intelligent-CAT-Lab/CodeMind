<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
10000 1

Expected output:
10000


```
import math
h, a = map ( int, input ( ). split ( ) )
print ( math. ceil ( h / a ) )


```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(Math.ceil(h/a));
    }
}
```
<|endoftext|>

<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
3 1 5

Expected output:
7


```


a,b,x = [int(i) for i in input().split()]

d = a - b
n = max(0,(x - b)) // d
ans = x + n * b
print(ans % 1000000007)


```

java code:<fim_suffix><fim_middle>

```

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int d = a - b;
        int n = Math.max(0, (x - b)) / d;
        int ans = x + n * b;
        System.out.println(ans % 1000000007);
    }
}

```
<|endoftext|>

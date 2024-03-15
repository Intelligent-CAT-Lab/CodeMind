<s> Translate the following python code to java and enclose your solution inside ```java```:
```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```

### Input

```
1 2
```

### Output

```
0.603448
```

### Explanation

```
a,b=(int(x) for x in input().split())

if a<=100 and b<=100:
    print(f"{a*b/3.305785:.4f}")

```

### Code

```java
import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a <= 100 && b <= 100) {
            System.out.println(String.format("%.4f", a * b / 3.305785));
        }
    }
}
```
</s>

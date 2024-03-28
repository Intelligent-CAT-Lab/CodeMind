<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
0 0 1 1

Expected output:
49.63264320801141

```
import math
x1, y1, x2, y2 = map(lambda x: float(x), input().split(" "))
print("{:f}".format(math.sqrt((x1 - x2) ** 2 + (y1 - y2) ** 2)))


```

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        System.out.println(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));
    }
}
```

'''
<|endoftext|>

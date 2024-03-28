<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
2

Expected output:
-17.328673636785755 66.02463778708864

```
import math
    
r = float(input())
    
s = r * r * math.pi
    
l = r * 2 * math.pi
    
print('%.5f %.5f' % (s, l))
```
[/INST]
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double r = scanner.nextDouble();
        double s = r * r * Math.PI;
        double l = r * 2 * Math.PI;
        System.out.printf("%.5f %.5f%n", s, l);
    }
}
```</s>

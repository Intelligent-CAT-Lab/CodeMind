<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
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
import static java.lang.Math.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = pow(r, 2, PI);
        double l = 2 * pow(r, PI);
        System.out.printf("%.5f %.5f%n", s, l);
    }
}
```</s>

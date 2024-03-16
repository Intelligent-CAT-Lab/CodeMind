<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```:
```
import math
    
r = float(input())
    
s = r * r * math.pi
    
l = r * 2 * math.pi
    
print('%.5f %.5f' % (s, l))
```

java code:<fim_suffix><fim_middle>
```java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = Math.PI * r * r;
        double l = 2 * Math.PI * r;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```
'''
<|endoftext|>

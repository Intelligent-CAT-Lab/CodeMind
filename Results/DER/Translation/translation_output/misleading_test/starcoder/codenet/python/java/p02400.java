<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
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

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double s = Math.pow(r, 2) * Math.PI;
        double l = 2 * Math.PI * r;
        System.out.printf("%.5f %.5f", s, l);
    }
}
```
'''
<|endoftext|>

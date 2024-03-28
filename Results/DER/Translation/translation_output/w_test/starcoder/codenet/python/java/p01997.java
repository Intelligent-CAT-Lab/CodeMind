<fim_prefix>Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
1 2

Expected output:
33.510322


```
from math import pi

A, B = map(float, input().split())
print('{:.10f}'.format(4/3*pi*B**3))

```

java code:<fim_suffix><fim_middle>
```
import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        System.out.printf("%.10f", 4/3*Math.PI*B*B*B);
    }
}
```
'''
<|endoftext|>

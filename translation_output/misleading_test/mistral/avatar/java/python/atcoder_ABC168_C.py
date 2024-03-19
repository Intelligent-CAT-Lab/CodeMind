<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2 9 49

Expected output:
-45.96915777646216

```
import java.util.Scanner;

public class atcoder_ABC168_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        double tmp1 = sc.nextDouble();
        double tmp2 = sc.nextDouble();
        
        double h = tmp1 / 6. * Math.PI + tmp2 / 30. * Math.PI / 12.;
        double m = tmp2 / 30. * Math.PI + tmp1 / 6. * Math.PI * 12.;
        double rad = h - m;
        
        double res = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2. * a * b * Math.cos(rad)));
        
        System.out.println(res);
    }
}
```
[/INST]
```python
import math

a = int(input())
b = int(input())
tmp1 = float(input())
tmp2 = float(input())

h = (tmp1 / 6.0) * math.pi + (tmp2 / 30.0) * math.pi / 12.0
m = (tmp2 / 30.0) * math.pi + (tmp1 / 6.0) * math.pi * 12.0
rad = h - m

res = math.sqrt(math.pow(a, 2) + math.pow(b, 2) - (2.0 * a * b * math.cos(rad)))

print(res)
```</s>

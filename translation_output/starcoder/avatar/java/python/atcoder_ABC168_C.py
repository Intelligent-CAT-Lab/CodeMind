<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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

python code:<fim_suffix><fim_middle>
```python
import math

a, b = map(int, input().split())
h, m = map(float, input().split())

rad = h - m

res = math.sqrt(a**2 + b**2 - 2 * a * b * math.cos(rad))

print(res)
```
"""

import math

a, b = map(int, input().split())
h, m = map(float, input().split())

rad = h - m

res = math.sqrt(a**2 + b**2 - 2 * a * b * math.cos(rad))

print(res)
<|endoftext|>

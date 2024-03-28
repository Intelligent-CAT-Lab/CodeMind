<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
180 120 90

Expected output:
60.0


```
import java.util.*;

public class p00411{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double a = scan.nextInt();
        double t = scan.nextInt();
        double r = scan.nextInt();
        System.out.println(r * t / a);
        scan.close();
    }
}

```
[/INST]
```python
a = float(input())
t = float(input())
r = float(input())
print(r * t / a)
```</s>

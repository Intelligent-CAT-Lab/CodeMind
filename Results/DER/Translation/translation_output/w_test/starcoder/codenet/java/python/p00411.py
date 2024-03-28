<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python
import sys

a = float(sys.stdin.readline())
t = float(sys.stdin.readline())
r = float(sys.stdin.readline())

print(r * t / a)

```

'''
<|endoftext|>

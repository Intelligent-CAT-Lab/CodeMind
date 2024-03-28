<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
12 4

Expected output:
4


```
import java.util.*;

public class p02885 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] line1 = line.split(" ");
        int a = Integer.parseInt(line1[0]);
        int b = Integer.parseInt(line1[1]);
        if(a > 2 * b)   System.out.println(a - 2 * b);
        else System.out.println(0);
    }
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

a, b = map(int, sys.stdin.readline().split())
print(max(0, a - 2 * b))
```
"""
<|endoftext|>

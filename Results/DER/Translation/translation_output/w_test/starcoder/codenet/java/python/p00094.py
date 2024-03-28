<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
113.437508


```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

while True:
    try:
        a, b = map(float, sys.stdin.readline().split())
        print(a*b/3.305785)
    except EOFError:
        break
```
<|endoftext|>

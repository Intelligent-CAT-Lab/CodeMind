<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
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
        x, y = map(float, sys.stdin.readline().split())
        print(x*y/3.305785)
    except EOFError:
        break
```
"""
<|endoftext|>

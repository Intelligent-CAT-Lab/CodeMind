<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
15 25

Expected output:
66.94277711156654

```
import java.util.*;

public class p00094 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) System.out.println((sc.nextDouble()*sc.nextDouble())/3.305785);
	}	
}
```
[/INST]
```python
import sys

def main():
    while True:
        try:
            x, y = map(float, sys.stdin.readline().strip().split())
            print(x*y/3.305785)
        except ValueError:
            break

if __name__ == '__main__':
    main()
```</s>

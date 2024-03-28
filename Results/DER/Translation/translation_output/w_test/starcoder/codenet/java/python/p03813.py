<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
ABC


```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```

python code:<fim_suffix><fim_middle>

```python
import sys

def main():
    print("ABC" if int(sys.stdin.readline()) < 1200 else "ARC")

if __name__ == "__main__":
    main()
```
"""
<|endoftext|>

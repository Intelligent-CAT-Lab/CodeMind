<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1000

Expected output:
6BC

```
import java.util.*;
public class p03813{
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println(s.nextInt()<1200?"ABC":"ARC");
	}
}
```
[/INST]
```python
# Sample test case
n = int(input())

# Expected output
if n < 1200:
    print("ABC")
else:
    print("ARC")
```</s>

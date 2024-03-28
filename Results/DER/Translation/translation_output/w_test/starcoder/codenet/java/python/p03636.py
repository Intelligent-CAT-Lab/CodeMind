<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
internationalization

Expected output:
i18n


```
import java.util.*;
public class p03636 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int leng = s.length();
		System.out.print(s.charAt(0));
		System.out.print(leng-2);
		System.out.println(s.charAt(leng-1));
	}

}
```

python code:<fim_suffix><fim_middle>

```python
import sys

s = sys.stdin.readline().strip()
print(s[0])
print(len(s)-2)
print(s[-1])
```
<|endoftext|>

<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
import java.io.*;

public class p03260 {
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		if((n*k) % 2 == 1) {
			System.out.println("Yes");
		}
		else System.out.println("No");
	}
}

```

python code:<fim_suffix><fim_middle>
```python
import sys

n, k = map(int, sys.stdin.readline().split())

if (n*k) % 2 == 1:
    print("Yes")
else:
    print("No")
```
"""
<|endoftext|>

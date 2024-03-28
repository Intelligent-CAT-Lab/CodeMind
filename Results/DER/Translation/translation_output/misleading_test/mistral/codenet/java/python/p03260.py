<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1

Expected output:
Y$s

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
[/INST]
```python
n, k = map(int, input().split())
if (n*k) % 2 == 1:
    print("Yes")
else:
    print("No")
```</s>

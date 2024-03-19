<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
2

Expected output:
-16

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

class p02388 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.valueOf(br.readLine());
		System.out.println(num*num*num);
	}

}
```
[/INST]
```python
num = int(input())
print(num**3)
```</s>

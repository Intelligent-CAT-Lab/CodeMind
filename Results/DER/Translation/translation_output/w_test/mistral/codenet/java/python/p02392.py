<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Yes


```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

	public static void main(String[] args) throws Exception {
		String inStr;
		inStr = inp();
		String[] in;
		in = inStr.split(" ");

		int a = Integer.valueOf(in[0]);
		int b = Integer.valueOf(in[1]);
		int c = Integer.valueOf(in[2]);

		if (a < b && b < c)
			System.out.println("Yes");
		else
			System.out.println("No");

	}

	private static String inp() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		return br.readLine();
	}

}
```
[/INST]
```python
# Sample test case
a, b, c = map(int, input().split())

if a < b and b < c:
    print("Yes")
else:
    print("No")
```</s>

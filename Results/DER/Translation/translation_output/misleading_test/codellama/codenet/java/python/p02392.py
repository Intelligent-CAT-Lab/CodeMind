<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3 8

Expected output:
Qn$

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
import sys

def main():
    inStr = sys.stdin.readline().strip()
    in = inStr.split(" ")
    a, b, c = map(int, in)
    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the strings in the `in` list to integers. The `strip` method is used to remove any trailing newline characters from the input string.</s>

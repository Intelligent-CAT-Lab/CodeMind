<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
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
```
import sys

def main():
    inStr = sys.stdin.readline()
    in = inStr.split(" ")
    a, b, c = map(int, in)
    if a < b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
Note that the `inp()` function is not needed in Python, as the input can be read directly from `sys.stdin`. The `BufferedReader` and `InputStreamReader` classes are not needed either, as Python has built-in support for reading input from the console.</s>

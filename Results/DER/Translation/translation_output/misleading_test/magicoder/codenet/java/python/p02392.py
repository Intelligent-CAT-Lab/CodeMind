<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def main():
    in_str = input()
    in_list = in_str.split()

    a = int(in_list[0])
    b = int(in_list[1])
    c = int(in_list[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the user, checks if they are in ascending order, and prints "Yes" if they are and "No" otherwise.<｜end▁of▁sentence｜>

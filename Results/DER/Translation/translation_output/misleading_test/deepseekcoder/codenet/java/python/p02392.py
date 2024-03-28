<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def main():
    inStr = input()
    inStr = inStr.split(" ")

    a = int(inStr[0])
    b = int(inStr[1])
    c = int(inStr[2])

    if a < b and b < c:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```

In the Python version, we use the built-in `input()` function to read the input from the user. The `split(" ")` function is used to split the input string into a list of strings. Then, we convert each string in the list to an integer using the `int()` function. Finally, we check if the first number is less than the second number and the second number is less than the third number. If both conditions are true, we print "Yes", otherwise we print "No".
<|EOT|>

Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
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

### Response:
```python
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

        if (a < b and b < c)
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

In Python, we can use the `and` operator instead of the `&&` operator to combine conditions. We can also use the `print()` function instead of `System.out.println()`. Here's the modified code:

```python
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02392 {

    public static void main(String[] args) throws Exception {
        String inStr;
        inStr = inp();
        String[] in;
        in = inStr.split(" ");

        int a = int(in[0]);
        int b = int(in[1]);
        int c = int(in[2]);

        if (a < b < c)
            print("Yes");
        else
            print("No");

    }

    private static String inp() throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }

}
```

Note that we need to convert the input strings to integers using the `int()` function.<|endoftext|>

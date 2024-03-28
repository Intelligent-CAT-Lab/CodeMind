<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
0


```
import java.util.Scanner;

public class p00291 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a[]=new int[6];
		int b=0;
		for(int i=0;i<6;i++){
			a[i]=stdIn.nextInt();
		}
		b=a[0]+a[1]*5+a[2]*10+a[3]*50+a[4]*100+a[5]*500;
		if(1000<=b)
			System.out.println("1");
		else
			System.out.println("0");
	}
}
```

@@ Response
```python
# Python code

# Read input
a = list(map(int, input().split()))

# Calculate the value
b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500

# Check if the value is greater than or equal to 1000
if b >= 1000:
    print("1")
else:
    print("0")
```

In this Python code, we use the `input()` function to read the input from the user. The `split()` function is used to split the input into a list of strings, and the `map()` function is used to convert each string into an integer.

Then, we calculate the value of `b` as per the Java code.

Finally, we check if `b` is greater than or equal to 1000. If it is, we print "1". Otherwise, we print "0".<｜end▁of▁sentence｜>

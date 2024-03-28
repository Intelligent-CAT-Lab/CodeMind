<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 1 4 0 4 1

Expected output:
88

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

### Response:
```python
def p00291():
    a = list(map(int, input().split()))
    b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
    if b >= 1000:
        print("1")
    else:
        print("0")

p00291()
```

This Python function reads a line of input, splits it into a list of integers, and then calculates the sum of the integers based on the given conditions. If the sum is 1000 or greater, it prints "1", otherwise it prints "0".
<|EOT|>

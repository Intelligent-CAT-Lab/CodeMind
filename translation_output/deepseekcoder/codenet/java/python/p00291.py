<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    a = [int(sys.stdin.readline()) for _ in range(6)]
    b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads six integers from the standard input, calculates the sum of these integers according to a specific formula, and then prints "1" if the sum is 1000 or greater, and "0" otherwise.
<|EOT|>

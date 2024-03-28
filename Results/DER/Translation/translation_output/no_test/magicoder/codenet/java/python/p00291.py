<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    a = [int(x) for x in sys.stdin.readline().split()]
    b = a[0] + a[1]*5 + a[2]*10 + a[3]*50 + a[4]*100 + a[5]*500
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads six integers from the standard input, calculates the sum of the integers according to the given rules, and then checks if the sum is greater than or equal to 1000. If it is, it prints "1", otherwise it prints "0".<｜end▁of▁sentence｜>

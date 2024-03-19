<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    a = list(map(int, sys.stdin.readline().split()))
    b = a[0] + a[1] * 5 + a[2] * 10 + a[3] * 50 + a[4] * 100 + a[5] * 500
    if b >= 1000:
        print("1")
    else:
        print("0")

if __name__ == "__main__":
    main()
```
Note: The `map` function is used to convert the input string to a list of integers. The `split` method is used to split the input string into a list of strings, and the `int` function is used to convert each string to an integer. The `readline` method is used to read a line of input from the standard input stream.</s>

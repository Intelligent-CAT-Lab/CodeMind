<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 3

Expected output:
Positive

```
import java.util.Scanner;

public class p04033 {
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		int a=s.nextInt(),b=s.nextInt();
		if(a<=0&&0<=b)
			System.out.println("Zero");
		else
			System.out.println((Math.min(0,b)-Math.min(-1,a))%2==1?"Positive":"Negative");
	}
}

```
[/INST]
```
import math

def main():
    a, b = map(int, input().split())
    if a <= 0 and 0 <= b:
        print("Zero")
    else:
        print("Positive" if (math.min(0, b) - math.min(-1, a)) % 2 == 1 else "Negative")

if __name__ == "__main__":
    main()
```
Note: The `math.min()` function is used to find the minimum of two numbers, and the `%` operator is used to find the remainder of the division of two numbers. The `if __name__ == "__main__":` block is used to indicate that the `main()` function should be executed when the script is run as a standalone program.</s>

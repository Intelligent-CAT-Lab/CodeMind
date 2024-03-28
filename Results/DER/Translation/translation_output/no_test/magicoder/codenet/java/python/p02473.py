<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
```


import java.math.BigInteger;
import java.util.Scanner;

public class p02473 
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		BigInteger a = new BigInteger(sc.next());
		BigInteger b = new BigInteger(sc.next());
		
		a = a.subtract(b);
		
		System.out.println(a);
	}

}


```

@@ Response
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())
    
    a = a - b
    
    print(a)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, subtracts the second from the first, and then prints the result.<｜end▁of▁sentence｜>

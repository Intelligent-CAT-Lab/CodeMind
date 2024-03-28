<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p02952
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a,b,c=0;
		a=sc.nextInt();
		for(int i=1;i<=a;i++)
		{
			if(String.valueOf(i).length()%2 != 0)
			{c++;}
		}
		System.out.println(c);
	}
}
```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline())
    c = 0
    for i in range(1, a+1):
        if len(str(i)) % 2 != 0:
            c += 1
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, counts the number of integers from 1 to the input integer that have an odd number of digits, and prints the count.
<|EOT|>

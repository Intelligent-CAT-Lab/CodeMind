<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
import java.util.Scanner;
 
 
public class p01447{
     
    public static void main(String[] args){
    	
    	final Scanner sc = new Scanner(System.in);
    	
    	long n = sc.nextLong();
    	int count = 0;
    	
    	while(n > 1){
    		n  = (n + (n % 3 == 0 ? 0 : 3 - n % 3)) / 3;
    		count++;
    	}
    	
    	System.out.println(count);
    	
    }
     
}
```

@@ Response
```python
n = int(input())
count = 0

while n > 1:
    if n % 3 == 0:
        n = n // 3
    else:
        n = (n + 3 - n % 3) // 3
    count += 1

print(count)
```

This Python code does the same thing as the Java code. It reads an integer from the standard input, then repeatedly divides it by 3 until it becomes 1. The number of divisions is counted and printed out.<｜end▁of▁sentence｜>

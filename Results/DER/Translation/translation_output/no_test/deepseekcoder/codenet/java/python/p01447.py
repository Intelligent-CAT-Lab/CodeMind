<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def p01447():
    n = int(sys.stdin.readline())
    count = 0

    while n > 1:
        n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
        count += 1

    print(count)

p01447()
```

This Python code does the same thing as the Java code. It reads a long integer from the standard input, then repeatedly divides it by 3 (or increments it by the smallest possible amount to make it divisible by 3) until it becomes 1, counting the number of such operations. The result is then printed to the standard output.
<|EOT|>

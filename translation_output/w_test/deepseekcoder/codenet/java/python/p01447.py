<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
def p01447(n):
    count = 0
    while n > 1:
        n = (n + (0 if n % 3 == 0 else 3 - n % 3)) // 3
        count += 1
    return count

n = int(input())
print(p01447(n))
```

In this Python code, we define a function `p01447` that takes a long integer `n` as input and returns the number of steps required to reduce `n` to 1. The function uses a while loop to repeatedly divide `n` by 3 and increment a counter until `n` is less than or equal to 1. The `//` operator is used for integer division in Python. The input is read from the standard input and the result is printed to the standard output.
<|EOT|>

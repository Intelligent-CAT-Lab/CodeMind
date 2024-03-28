<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abc

Expected output:
ba

```
import java.util.Scanner;

public class p03227 {
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String a = sc.next();
		String[] b = a.split("");
		
		int c=a.length();
		
		if(c==3){
			String str=b[0];
			b[0]=b[2];
			b[2]=str;
		}
		
		for(int i=0;i<c;i++){		
			System.out.print(b[i]);
		} 
	}

}

```

### Response:
```python
def swap_chars(s):
    if len(s) == 3:
        return s[2] + s[1] + s[0]
    else:
        return s

print(swap_chars(input()))
```

This Python code does the same thing as the Java code. It reads a string from the input, checks if its length is 3, and if so, swaps the first and last characters. Otherwise, it just returns the string as is. The result is then printed to the console.
<|EOT|>

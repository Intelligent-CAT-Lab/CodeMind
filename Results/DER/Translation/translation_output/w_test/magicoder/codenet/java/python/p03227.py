<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
abc

Expected output:
cba


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

@@ Response
```python
# Python code

def reverse_string(input_string):
    return input_string[::-1]

input_string = input()
print(reverse_string(input_string))
```

In the above Python code, we define a function `reverse_string` that takes a string as input and returns the reversed string. We then take an input string from the user and print the reversed string. This is equivalent to the Java code provided.<｜end▁of▁sentence｜>

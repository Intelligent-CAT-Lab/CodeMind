<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
def swap_chars(s):
    if len(s) == 3:
        return s[2] + s[1] + s[0]
    else:
        return s

s = input()
print(swap_chars(s))
```

This Python code does the same thing as the Java code. It reads a string from the user, checks if the string has exactly 3 characters, and if so, swaps the first and third characters. If the string has more or less than 3 characters, it leaves the string unchanged.<｜end▁of▁sentence｜>

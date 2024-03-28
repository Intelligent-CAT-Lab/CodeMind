<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    a = sys.stdin.readline().strip()
    b = list(a)

    c = len(a)

    if c == 3:
        str = b[0]
        b[0] = b[2]
        b[2] = str

    for i in range(c):
        print(b[i], end='')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from the standard input, splits it into a list of characters, and then swaps the first and third characters if the string length is 3. Finally, it prints the characters in the list.<｜end▁of▁sentence｜>

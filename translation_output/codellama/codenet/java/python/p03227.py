<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

[/INST]
```python
import sys

def main():
    a = sys.stdin.readline().strip()
    b = a.split("")
    c = len(a)

    if c == 3:
        str = b[0]
        b[0] = b[2]
        b[2] = str

    for i in range(c):
        print(b[i], end="")

if __name__ == "__main__":
    main()
```
Note: The `sys.stdin.readline().strip()` line reads a line from the standard input and removes any trailing whitespace. The `a.split("")` line splits the string `a` into a list of individual characters. The `len(a)` line gets the length of the string `a`. The `if c == 3:` line checks if the length of the string is 3, and if it is, it swaps the first and third characters of the list `b`. The `for i in range(c):` line loops through the list `b` and prints each character.</s>

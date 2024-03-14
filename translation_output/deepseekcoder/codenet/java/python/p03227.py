<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    a = sys.stdin.readline().strip()
    b = list(a)
    c = len(a)

    if c == 3:
        b[0], b[2] = b[2], b[0]

    print(''.join(b))

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, splits it into a list of characters, and then swaps the first and third characters if the string is of length 3. Finally, it prints the characters in the list.
<|EOT|>

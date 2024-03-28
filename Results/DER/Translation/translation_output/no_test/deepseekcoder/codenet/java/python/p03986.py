<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p03986 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String x = sc.next();
		int c =0;
		int len =0;
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='T') {
				c--;
			}
			else {
				if(c<0) {
					len-=c;
					c=1;
				}
				else {
					c++;
				}
			}
		}
		len+=Math.abs(c);
		System.out.println(len);
	}
	
}

```

### Response:
```python
import sys

def main():
    x = sys.stdin.readline().strip()
    c = 0
    len = 0
    for i in x:
        if i == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1
    len += abs(c)
    print(len)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a string from standard input, then iterates over each character in the string. If the character is 'T', it decrements `c`. Otherwise, if `c` is less than 0, it subtracts `c` from `len` and sets `c` to 1. Otherwise, it increments `c`. Finally, it adds the absolute value of `c` to `len` and prints the result.
<|EOT|>

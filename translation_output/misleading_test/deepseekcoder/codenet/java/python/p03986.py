<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
TSTTSS

Expected output:
13

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
def p03986(x):
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
    return len

print(p03986("TSTTSS"))
```

This Python function works similarly to the Java code. It iterates over each character in the input string, and for each character, it checks if it's 'T'. If it is, it decrements the counter `c`. If it's not, it checks if `c` is less than 0. If it is, it subtracts `c` from `len` and sets `c` to 1. If `c` is not less than 0, it increments `c` by 1. Finally, it adds the absolute value of `c` to `len` and returns `len`.
<|EOT|>

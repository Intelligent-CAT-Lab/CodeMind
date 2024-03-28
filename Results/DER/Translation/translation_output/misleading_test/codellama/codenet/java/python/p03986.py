<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```python
import sys

def main():
    x = sys.stdin.readline().strip()
    c = 0
    len = 0
    for i in range(len(x)):
        if x[i] == 'T':
            c -= 1
        else:
            if c < 0:
                len -= c
                c = 1
            else:
                c += 1
    len += abs(c)
    print(len)

if __name__ == '__main__':
    main()
```
This is the Python code that translates the given Java code. The code uses the `sys` module to read input from the standard input and the `abs` function to get the absolute value of the variable `c`. The rest of the code is similar to the Java code, with some minor changes to account for the differences in syntax between the two languages.</s>

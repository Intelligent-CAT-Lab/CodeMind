System:
You are an expert python programmer and assistant

Question:
Translate the following code from java to python and enclose your solution inside ```python```:
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


Answer:
```python
import sys

x = input()
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
```<|endoftext|>

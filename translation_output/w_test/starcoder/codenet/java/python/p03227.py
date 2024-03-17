<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
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

python code:<fim_suffix><fim_middle>

```python

import sys

a = sys.stdin.readline()

b = list(a)

c = len(a)

if c == 3:
	b[0], b[2] = b[2], b[0]

print(''.join(b))

```
<|endoftext|>

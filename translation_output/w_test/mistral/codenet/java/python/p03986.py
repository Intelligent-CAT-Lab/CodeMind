<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
TSTTSS

Expected output:
4


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
# Sample test case
x = "TSTTSS"

# Initialize variables
c = 0
len = 0

# Loop through each character in the input string
for i in range(len(x)):
    # If current character is 'T', decrement count
    if x[i] == 'T':
        c -= 1
    # If count is negative, subtract it from length and reset count to 1
    elif c < 0:
        len -= c
        c = 1
    # Otherwise, increment count
    else:
        c += 1

# Add absolute value of count to length and print result
len += abs(c)
print(len)
```</s>

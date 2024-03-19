<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
575

Expected output:
Ye

```
import java.util.Scanner;
public class p03631 {

    public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	// å¥å
    	int a = sc.nextInt();

    	int a100 = a/100;
    	int a10 = a/10 - a100*10;
    	int a1 = a - a100*100 - a10*10;
    	int rev = a1*100 + a10*10 + a100;
    	String ans;

    	if (a == rev){
    		ans = "Yes";
    	} else {
    		ans = "No";
    	}

    	// åºå
    	System.out.println(ans);
    }
}
```
[/INST]
```python
import sys

a = int(sys.stdin.readline().strip())

a100 = a // 100
a10 = (a - a100 * 100) // 10
a1 = a - a100 * 100 - a10 * 10
rev = a1 * 100 + a10 * 10 + a100

if a == rev:
    ans = "Yes"
else:
    ans = "No"

print(ans)
```
Note: The `//` operator is used for integer division in Python, which is equivalent to the `/` operator in Java. The `strip()` method is used to remove any trailing newline characters from the input string.</s>

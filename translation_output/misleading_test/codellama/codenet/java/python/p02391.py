<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
a  `b

```
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class p02391 {

	public static void main(String[] args) {
		
		String CMD = null ;
		BufferedReader BR = null;
		BR = new BufferedReader(new InputStreamReader(System.in));
		try {CMD = BR.readLine();
		} 
		catch (IOException e) {e.printStackTrace();
		}
		String[] str = CMD.split(" "); 
		
		int x = Integer.parseInt(str[0]);
		int y = Integer.parseInt(str[1]);
		
		if(x==y){
			System.out.println("a == b");
		}if(x<y){
			System.out.println("a < b");
		}if(x>y){
			System.out.println("a > b");
		}

	}

}
```
[/INST]
```python
import sys

# Read the input from stdin
input_str = sys.stdin.readline()

# Split the input into two integers
x, y = map(int, input_str.split())

# Compare the two integers and print the result
if x == y:
    print("a == b")
elif x < y:
    print("a < b")
else:
    print("a > b")
```
Note: The `map` function is used to convert the input string into two integers. The `split` method is used to split the input string into two parts, and the `int` function is used to convert the two parts into integers.</s>

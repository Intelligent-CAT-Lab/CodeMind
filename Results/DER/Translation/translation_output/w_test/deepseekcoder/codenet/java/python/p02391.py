<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
1 2

Expected output:
a < b


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

### Response:
```python
import sys

def compare_numbers(x, y):
    if x == y:
        return "a == b"
    elif x < y:
        return "a < b"
    else:
        return "a > b"

x, y = map(int, sys.stdin.readline().split())
print(compare_numbers(x, y))
```

In this Python code, we define a function `compare_numbers(x, y)` that takes two integers as input and returns a string indicating whether `x` is less than, equal to, or greater than `y`. We then read two integers from the standard input, pass them to `compare_numbers()`, and print the result.
<|EOT|>

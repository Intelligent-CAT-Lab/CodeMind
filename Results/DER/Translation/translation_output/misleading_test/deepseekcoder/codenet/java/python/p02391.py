<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def main():
    line = sys.stdin.readline().split()
    x, y = int(line[0]), int(line[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    elif x > y:
        print("a > b")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, and then compares them to determine if they are equal, less than, or greater than each other. The result is then printed to the standard output.
<|EOT|>

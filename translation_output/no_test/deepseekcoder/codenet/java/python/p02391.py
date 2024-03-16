<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
    CMD = sys.stdin.readline().strip()
    str = CMD.split(" ")
    x = int(str[0])
    y = int(str[1])

    if x == y:
        print("a == b")
    elif x < y:
        print("a < b")
    elif x > y:
        print("a > b")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, splits it into two parts, converts those parts to integers, and then compares them. It prints "a == b" if they're equal, "a < b" if the first number is less than the second, and "a > b" if the first number is greater than the second.
<|EOT|>

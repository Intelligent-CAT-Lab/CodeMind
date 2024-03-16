<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
```python
import sys

def main():
    try:
        CMD = sys.stdin.readline().strip()
        x, y = map(int, CMD.split())

        if x == y:
            print("a == b")
        elif x < y:
            print("a < b")
        elif x > y:
            print("a > b")
    except Exception as e:
        print(e)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line from the standard input, splits it into two integers, and then compares them. The comparison result is printed to the standard output. If any error occurs during the process, it is caught and printed to the standard error output.<｜end▁of▁sentence｜>

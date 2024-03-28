<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4 2 2 1

Expected output:
Ye

```
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class p02394{

	public static void main(String[] args) {
		
		//å¥å
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String work[]=new String[5];
		try {
			work=br.readLine().split("\\s+");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		int W=Integer.parseInt(work[0]);
		int H=Integer.parseInt(work[1]);
		int x=Integer.parseInt(work[2]);
		int y=Integer.parseInt(work[3]);
		int r=Integer.parseInt(work[4]);
		
		//å¤å®å¦ç
		String judge;
		if((x-r)>=0 && (x+r)<=W){
			if(((y-r)>=0 && (y+r)<=H)) {
				judge="Yes";
			}else {
				judge="No";
			}
		}else {
			judge="No";
		}
		
		//åºå
		System.out.println(judge);
	}

}


```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    # Read input
    work = sys.stdin.readline().split()

    W = int(work[0])
    H = int(work[1])
    x = int(work[2])
    y = int(work[3])
    r = int(work[4])

    # Check if the circle is inside the rectangle
    judge = "Yes" if (0 <= x-r and x+r <= W) and (0 <= y-r and y+r <= H) else "No"

    # Print the result
    print(judge)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, checks if the circle is inside the rectangle, and prints the result. The `if __name__ == "__main__":` part is a common idiom in Python to make sure the `main()` function is only called when the script is run directly, not when it's imported as a module.<｜end▁of▁sentence｜>

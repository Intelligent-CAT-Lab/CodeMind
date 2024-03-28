<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 4 2 2 1

Expected output:
Yes


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

### Response:
```python
import sys

def main():
    work = sys.stdin.readline().split()
    W, H, x, y, r = [int(i) for i in work]

    if (x-r) >= 0 and (x+r) <= W:
        if ((y-r) >= 0 and (y+r) <= H):
            judge = "Yes"
        else:
            judge = "No"
    else:
        judge = "No"

    print(judge)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads in a line of input from the standard input, splits it into a list of strings, converts those strings to integers, and assigns them to the variables W, H, x, y, and r. It then checks if the circle's center is within the rectangle and if the circle's radius is within the rectangle, assigning "Yes" to `judge` if it is and "No" if it isn't. Finally, it prints `judge`.
<|EOT|>

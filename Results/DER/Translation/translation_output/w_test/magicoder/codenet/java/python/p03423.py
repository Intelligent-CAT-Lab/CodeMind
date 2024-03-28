<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
2


```
import java.io.*;
import java.util.*;

class p03423 {
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String l = br.readLine();
		 StringTokenizer st = new StringTokenizer(l);
    int answer = (int)Math.floor(Integer.parseInt(st.nextToken())/3);
    System.out.println(answer);
    
  }
}
```

@@ Response
```python
import math

def main():
    n = int(input())
    answer = math.floor(n / 3)
    print(answer)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `input()` function to read the input from the user. We then divide the input by 3 using the `/` operator and use the `math.floor()` function to round down to the nearest integer. The result is then printed to the console using the `print()` function.<｜end▁of▁sentence｜>

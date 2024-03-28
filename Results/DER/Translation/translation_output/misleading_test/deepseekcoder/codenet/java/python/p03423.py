<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
8

Expected output:
-71

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

### Response:
```python
import sys

def main():
    n = int(sys.stdin.readline().strip())
    answer = n // 3
    print(answer)

if __name__ == "__main__":
    main()
```

In this Python code, we use the `sys.stdin.readline().strip()` method to read the input from the standard input. The `//` operator is used for integer division in Python. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>

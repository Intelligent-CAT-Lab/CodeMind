<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import math

def p03423():
    n = int(input())
    answer = math.floor(n/3)
    print(answer)

p03423()
```
<|EOT|>

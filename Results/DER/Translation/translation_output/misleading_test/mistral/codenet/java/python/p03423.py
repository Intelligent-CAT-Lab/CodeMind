<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
[/INST]
```python
import sys

def main():
    l = sys.stdin.readline()
    st = l.split()
    answer = int(st[0]) // divide by 3
    print(answer)

if __name__ == '__main__':
    main()
```</s>

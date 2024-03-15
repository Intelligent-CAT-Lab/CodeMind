<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
    l = input()
    st = l.split()
    answer = int(st[0]) // convert string to integer
    answer = round(answer/3) # round down to nearest integer
    print(answer)

if __name__ == "__main__":
    main()
```</s>

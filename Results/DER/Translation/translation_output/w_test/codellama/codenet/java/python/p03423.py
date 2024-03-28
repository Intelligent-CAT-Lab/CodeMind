<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]
```
import math

def main():
    n = int(input())
    answer = math.floor(n / 3)
    print(answer)

if __name__ == '__main__':
    main()
```
This is the Python code that translates the given Java code. The `math.floor()` function is used to round down the result of the division to the nearest integer. The `input()` function is used to read the input from the user, and the `print()` function is used to print the output.

Here is the sample test case:
```
8
```
This is the input that the program expects. The output of the program should be `2`.</s>

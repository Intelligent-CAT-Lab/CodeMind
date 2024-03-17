<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
100
010
001


```
import java.util.*;

class p02903 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int h = Integer.parseInt(sc.next());
    int w = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    //int c[][] = new int[h][w];
    String s1 = "";
    String s2 = "";
    
    for(int j=0; j<w; j++){
      if (j<a) {
        s1 = s1 + "0";
        s2 = s2 + "1";
      } else {
        s1 = s1 + "1";
        s2 = s2 + "0";
      }
    }
    
    for(int i=0; i<h; i++){
        if(i<b) {
          System.out.print(s1);
        } else if (i>=b) {
          System.out.print(s2);
        }
        System.out.print("\n");
    }
    
//    for(int i=0; i<h; i++){
//      for(int j=0; j<w; j++){
//        System.out.print(c[i][j]);
//      }
//      System.out.print("\n");
//    }
    
  }
}

```
[/INST]
```python
import sys

h, w, a, b = map(int, sys.stdin.readline().split())

s1 = ""
s2 = ""

for j in range(w):
    if j < a:
        s1 += "0"
        s2 += "1"
    else:
        s1 += "1"
        s2 += "0"

for i in range(h):
    if i < b:
        print(s1)
    else:
        print(s2)
    print()
```
This code reads the input from stdin, which is the test case provided. It then uses the `map` function to convert the input strings to integers, and assigns them to the variables `h`, `w`, `a`, and `b`.

The code then initializes two empty strings, `s1` and `s2`, which will be used to store the binary strings. It then loops through the width of the matrix (i.e., `w`) and for each column, it checks if the column index is less than the value of `a`. If it is, it adds a "0" to `s1` and a "1" to `s2`. If it is not, it adds a "1" to `s1` and a "0" to `s2`.

After the loop, the code loops through the height of the matrix (i.e., `h`) and for each row, it checks if the row index is less than the value of `b`. If it is, it prints the value of `s1` to the console. If it is not, it prints the value of `s2` to the console. Finally, it prints a newline character to the console.

The code does not use a 2D array to store the binary strings, as the problem statement does not require it. Instead, it uses two separate strings, `s1` and `s2`, to store the binary strings. This approach is more efficient and simpler to implement.</s>

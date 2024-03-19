<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 3 1 1

Expected output:
113
-16
62

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
This code reads the input from stdin, which is a string containing the four integers separated by spaces. It then uses the `map` function to convert the string to a list of integers, and assigns them to the variables `h`, `w`, `a`, and `b`.

The code then initializes two empty strings, `s1` and `s2`, and uses a for loop to iterate over the width of the matrix (which is `w`). For each iteration, it checks if the current column is less than the value of `a`, and if so, it appends a "0" to `s1` and a "1" to `s2`. Otherwise, it appends a "1" to `s1` and a "0" to `s2`.

After the for loop, the code uses another for loop to iterate over the height of the matrix (which is `h`). For each iteration, it checks if the current row is less than the value of `b`, and if so, it prints the value of `s1` to stdout. Otherwise, it prints the value of `s2` to stdout. Finally, it prints a newline character to stdout.

Note that the code does not actually create a matrix, but rather uses the strings `s1` and `s2` to represent the rows of the matrix. This is because the problem statement does not require the creation of a matrix, but rather the printing of the rows of the matrix.</s>

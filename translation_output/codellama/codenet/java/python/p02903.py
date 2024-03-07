<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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


Translate the above java code to python.

python code:

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
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then it uses a nested loop to iterate over the rows and columns of the matrix and print the appropriate values.

Note that the Python code uses the `print()` function to print the values, while the Java code uses the `System.out.print()` method. Additionally, the Python code uses the `+=` operator to concatenate strings, while the Java code uses the `+` operator.</s>

<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    h, w, a, b = map(int, sys.stdin.readline().split())
    s1 = '0'*a + '1'*(w-a)
    s2 = '1'*a + '0'*(w-a)
    
    for i in range(h):
        if i < b:
            print(s1)
        else:
            print(s2)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads in four integers from the standard input, and then prints out a pattern of 0s and 1s to the standard output. The pattern alternates between a string of `a` zeros followed by a string of `w-a` ones, and a string of `b` ones followed by a string of `h-b` zeros.
<|EOT|>

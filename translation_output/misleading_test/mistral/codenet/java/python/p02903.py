<s> [INST] Translate the following java code to python and enclose your solution inside ```python```.
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
h, w, a, b = map(int, input().split())
s1, s2 = "0", "1"
for j in range(w):
    if j < a:
        s1 += "0"
        s2 += "1"
    else:
        s1 += "1"
        s2 += "0"
for i in range(h):
    if i < b:
        print(s1, end="")
    else:
        print(s2, end="")
    print()
```</s>

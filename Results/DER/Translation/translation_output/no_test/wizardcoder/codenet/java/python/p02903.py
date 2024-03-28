Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.*;

class p02903:
  def main(self):
    sc = Scanner(System.in)
    h = Integer.parseInt(sc.next())
    w = Integer.parseInt(sc.next())
    a = Integer.parseInt(sc.next())
    b = Integer.parseInt(sc.next())
    #int c[][] = new int[h][w];
    s1 = ""
    s2 = ""
    
    for j in range(w):
      if j < a:
        s1 = s1 + "0"
        s2 = s2 + "1"
      else:
        s1 = s1 + "1"
        s2 = s2 + "0"
    
    for i in range(h):
        if i < b:
          print(s1)
        elif i >= b:
          print(s2)
        print()

#    for i in range(h):
#      for j in range(w):
#        System.out.print(c[i][j])
#      System.out.print("\n")

p02903().main()
```<|endoftext|>

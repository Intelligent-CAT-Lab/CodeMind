<s> Translate the following java code to python and enclose your solution inside ```python```:
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

### 解答

```python
import java.util

class p02903:
    def main(self, args):
        sc = java.util.Scanner(java.lang.System.in)
        h = int(sc.next())
        w = int(sc.next())
        a = int(sc.next())
        b = int(sc.next())
        #c = [[] for _ in range(h)]
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
            else:
                print(s2)
        
        #for i in range(h):
        #    for j in range(w):
        #        print(c[i][j])
        
p02903().main(None)
```

### 解析

```python
import java.util

class p02903:
    def main(self, args):
        sc = java.util.Scanner(java.lang.System.in)
        h = int(sc.next())
        w = int(sc.next())
        a = int(sc.next())
        b = int(sc.next())
        #c = [[] for _ in range(h)]
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
            else:
                print(s2)
        
        #for i in range(h):
        #    for j in range(w):
        #        print(c[i][j])
        
p02903().main(None)
```

### 复杂度分析

- 时间复杂度：O(hw)。
- 空间复杂度：O(hw)。

### 相关题目

- [p02902](./p02902.md)
</s>

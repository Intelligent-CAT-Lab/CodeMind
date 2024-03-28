<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

public class p03777{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    if(a.equals(b)){
      System.out.println("H");
    }else{
      System.out.println("D");
    }
  }
}

```
[/INST]
```python
import java.util

def main():
    sc = java.util.Scanner(input)
    a = sc.next()
    b = sc.next()
    if a == b:
        print("H")
    else:
        print("D")

main()
```</s>

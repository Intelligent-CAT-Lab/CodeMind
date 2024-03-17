<fim_prefix>Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
H H

Expected output:
H


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

python code:<fim_suffix><fim_middle>

```python
a = input()
b = input()
if a == b:
    print("H")
else:
    print("D")
```

'''
<|endoftext|>

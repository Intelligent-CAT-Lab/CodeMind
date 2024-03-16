Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p02723{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    
    if(s.charAt(2)==s.charAt(3) && s.charAt(4) == s.charAt(5))
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}
```

### Response:
```python
import java.util.*;

class p02723:
  def main(self):
    sc = Scanner(System.in)
    s = sc.next()
    
    if s.charAt(2) == s.charAt(3) and s.charAt(4) == s.charAt(5):
      print("Yes")
    else:
      print("No")
```<|endoftext|>

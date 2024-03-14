Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;

class p03035{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(a<=5){
      System.out.println(0);
    }
    else if(a<=12){
      System.out.println((int)(b/2));
    }
    else{
      System.out.println(b);
    }
  }
}
```

### Response:
```python
import java.util.*;

class p03035:
  def main(self):
    sc = Scanner(System.in)
    a = sc.nextInt()
    b = sc.nextInt()
    
    if a <= 5:
      print(0)
    elif a <= 12:
      print(int(b/2))
    else:
      print(b)
```<|endoftext|>

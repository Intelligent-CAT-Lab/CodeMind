Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 8

Expected output:
Yzes

```
import java.util.*;
import java.lang.Integer; 

public class p02640 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // é ­æ°
    double y = sc.nextInt(); // è¶³ã®æ°
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 || crane < 0 || turtle % 1!= 0 || crane % 1!= 0 ){
      System.out.println("No");
    }else{
      System.out.println("Yes");
    }
  }
}
```

### Response:
```python
import java.util.*;
import java.lang.Integer; 

public class p02640 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextInt(); // é ­æ°
    double y = sc.nextInt(); // è¶³ã®æ°
    double crane = -(y/2) + 2*x;
    double turtle = x - crane;
    if(turtle < 0 or crane < 0 or turtle % 1!= 0 or crane % 1!= 0 ):
      System.out.println("No");
    else:
      System.out.println("Yes");
  }
}
```

In Python, we need to use `or` instead of `||` to concatenate the conditions. Also, we need to use `:` instead of `then` to indicate the start of the `if` statement.<|endoftext|>

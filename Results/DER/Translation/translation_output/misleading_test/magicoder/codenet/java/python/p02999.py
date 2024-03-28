<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
58

```
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class p02999{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    if (a<b){
      System.out.println(0);
    } else {
      System.out.println(10);
    }
  }
}
```

@@ Response
```python
# Python code

# input
a, b = map(int, input().split())

# check condition
if a < b:
    print(0)
else:
    print(10)
```

In the above Python code, we are taking two integers as input from the user. Then we are checking if the first integer is less than the second integer. If it is, we print 0. Otherwise, we print 10.<｜end▁of▁sentence｜>

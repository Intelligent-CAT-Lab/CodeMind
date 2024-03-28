<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
3 5

Expected output:
0


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

### Response:
```python
a, b = map(int, input().split())
if a < b:
    print(0)
else:
    print(10)
```
<|EOT|>

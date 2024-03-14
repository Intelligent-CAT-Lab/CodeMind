<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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
import sys

def main():
    a = int(sys.stdin.readline().strip())  # input Integer
    b = int(sys.stdin.readline().strip())  # input Integer
    # a = sys.stdin.readline().strip()  # input String
    if a < b:
        print(0)
    else:
        print(10)

if __name__ == "__main__":
    main()
```

In Python, we use `sys.stdin.readline().strip()` to read input from the console. The `strip()` function is used to remove any leading/trailing white spaces. The `if __name__ == "__main__":` line is used to call the `main()` function when the script is run directly.
<|EOT|>

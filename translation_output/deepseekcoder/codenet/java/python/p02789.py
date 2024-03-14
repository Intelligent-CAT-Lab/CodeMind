<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*;
public class p02789{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    if (n==m) {
      System.out.println("Yes");
    }
    else{
      System.out.println("No");
    }
 
  }
}
```

### Response:
```python
import sys

def main():
    n, m = map(int, sys.stdin.readline().split())
    if n == m:
        print("Yes")
    else:
        print("No")

if __name__ == "__main__":
    main()
```
<|EOT|>

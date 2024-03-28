<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

class p04029{

  public static void main(String arg[]){
  Scanner sc = new Scanner(System.in);
    
    int sum = 0;
    int n = sc.nextInt();
    for(int i = 1;i<=n;i++){
    sum = sum + i;
    }
    System.out.println(sum);
  }

}
```

### Response:
```python
import sys

def main():
    sum = 0
    n = int(sys.stdin.readline())
    for i in range(1, n+1):
        sum = sum + i
    print(sum)

if __name__ == "__main__":
    main()
```

In Python, we don't need to import a specific class to read from the standard input (stdin). Instead, we use the `sys.stdin.readline()` method to read a line from the standard input. The `int()` function is used to convert the input string to an integer. The `range()` function in Python is equivalent to the `for` loop in Java. The `print()` function is used to output the result.
<|EOT|>

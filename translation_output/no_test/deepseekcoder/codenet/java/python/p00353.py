<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;

public class p00353 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      String[] input = sc.nextLine().split(" ");
      int m = Integer.parseInt(input[0]);
      int f = Integer.parseInt(input[1]);
      int b = Integer.parseInt(input[2]);
      
      if(b > m + f) {
         System.out.println("NA"); 
      } else if (b > m){
         System.out.println(b - m);
      } else {
         System.out.println("0");
      }
   }
}

```

### Response:
```python
import sys

def main():
    input = sys.stdin.readline().split()
    m = int(input[0])
    f = int(input[1])
    b = int(input[2])

    if b > m + f:
        print("NA") 
    elif b > m:
        print(b - m)
    else:
        print("0")

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads a line of input from the standard input, splits it into three parts, converts the parts to integers, and then checks the conditions in the Java code. It prints the result of the check.
<|EOT|>

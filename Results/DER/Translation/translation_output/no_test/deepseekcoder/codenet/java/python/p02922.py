<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.Scanner;
public class p02922 {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    int ans = (b-1)/(a-1);
    if((b-1)%(a-1)==0) {
    	System.out.println(ans);
    }else {
    	System.out.println(ans+1);
    }
    }
}
```

### Response:
```python
import sys

def main():
    a = int(sys.stdin.readline())
    b = int(sys.stdin.readline())

    ans = (b-1)//(a-1)
    if((b-1)%(a-1)==0):
        print(ans)
    else:
        print(ans+1)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, calculates the result as per the formula provided in the Java code, and prints the result.
<|EOT|>

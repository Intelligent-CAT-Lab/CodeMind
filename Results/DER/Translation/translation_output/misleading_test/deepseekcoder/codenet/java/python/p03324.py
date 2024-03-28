<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
0 5

Expected output:
-54

```
import java.util.Scanner;

public class p03324{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Long D = sc.nextLong();
    Long A = (D==2)?10000L:(D==1)?100L:1L;
    Long N = sc.nextLong();
    Long ser = 0L;
    Long count = 0L;
    while(ser < N){
      count += 1L;
      if(search(count*A,D)){
        ser += 1L;
      }
      
    }
    System.out.println(count*A);
    sc.close();
  }
  public static boolean search(Long a,Long b){
    Long o = (a%1000000 == 0)?3L:(a%(10000)==0)?2L:(a%100==0)?1L:0L;
    if (b == o){
      return true;
    }
    else{
      return false;
    }
  }
}
  
```

### Response:
```python
import sys

def search(a, b):
    o = (a % 1000000 == 0) * 3 + (a % 10000 == 0) * 2 + (a % 100 == 0) * 1
    return b == o

def main():
    D, N = map(int, sys.stdin.readline().split())
    A = 10000 if D == 2 else 100 if D == 1 else 1
    ser = 0
    count = 0
    while ser < N:
        count += 1
        if search(count * A, D):
            ser += 1
    print(count * A)

if __name__ == "__main__":
    main()
```

In this Python code, the `search` function is translated from the Java code. It checks the last three digits of a number and compares it with the second input number. If they are the same, it returns `True`, otherwise `False`.

The `main` function reads the input numbers, calculates `A` based on `D`, and then enters a loop where it increments `count` and `ser` if `search` returns `True`. The loop continues until `ser` is no longer less than `N`. After the loop, it prints the product of `count` and `A`.

The `if __name__ == "__main__":` line ensures that the `main` function is only called when the script is run directly, not when it's imported as a module.
<|EOT|>

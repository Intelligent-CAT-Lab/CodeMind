<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
```
import java.util.*; 
class p03071 {
   public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
       int A = sc.nextInt();
       int B = sc.nextInt();
       int c = 0;
     
      for(int i = 0;i<2;i++){
       if(A>=B){c += A;A = A -1;}
        else{c += B;B = B -1;}
      }
       
     
     
     System.out.print(c);


   }
}

```

### Response:
```python
import sys

def main():
    A, B = map(int, sys.stdin.readline().split())
    c = 0
    for i in range(2):
        if A >= B:
            c += A
            A -= 1
        else:
            c += B
            B -= 1
    print(c)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads two integers from the standard input, initializes a counter to 0, and then iterates twice. In each iteration, it checks if `A` is greater than or equal to `B`. If `A` is greater than or equal to `B`, it adds `A` to the counter and decrements `A` by 1. If `A` is less than `B`, it adds `B` to the counter and decrements `B` by 1. Finally, it prints the value of the counter.
<|EOT|>

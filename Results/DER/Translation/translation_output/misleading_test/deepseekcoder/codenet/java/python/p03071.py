<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
5 3

Expected output:
-70

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

In this Python code, we use the `sys.stdin.readline().split()` function to read the input from the console. The `map()` function is used to convert the input strings to integers. The rest of the code is translated directly from the Java code.
<|EOT|>

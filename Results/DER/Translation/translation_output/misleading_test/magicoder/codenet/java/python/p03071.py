<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
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

@@ Response
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

This Python code does the same thing as the Java code. It reads two integers from the standard input, then it iterates twice, each time subtracting 1 from the larger of the two numbers and adding it to the sum `c`. Finally, it prints the sum `c`.<｜end▁of▁sentence｜>

<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
4 2 3

Expected output:
27 -83 -40 77

```
import java.util.Scanner;
import java.io.PrintWriter;

public class p02797 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(sc.next());
        int K = Integer.parseInt(sc.next());
        int S = Integer.parseInt(sc.next());
        if (K == 0){
            if (S == 1000000000){
                for (int i = 0; i < N; i++){
                    out.print("1 ");
                }
            }
            else{
                S += 1;
                for (int i = 0; i < N; i++){
                    out.print(S + " ");
                }
            }
        }
        else{
            for (int i = 0; i < N; i++){
                if (i < K){
                    out.print(S + " ");
                }
                else{
                    if (S == 1000000000){
                        out.print("1 ");
                    }
                    else{
                        out.print(S + 1);
                        out.print(" ");
                    }
                }
            }
        }


        //ãã³ãã¬
        sc.close();
        out.flush();
    }
}
```

@@ Response
Here is the equivalent Python code:

```python
import sys

def main():
    N, K, S = map(int, sys.stdin.readline().split())
    if K == 0:
        if S == 1000000000:
            print(' '.join(str(1) for _ in range(N)))
        else:
            S += 1
            print(' '.join(str(S) for _ in range(N)))
    else:
        for i in range(N):
            if i < K:
                print(S, end=' ')
            else:
                if S == 1000000000:
                    print(1, end=' ')
                else:
                    print(S + 1, end=' ')

if __name__ == "__main__":
    main()
```

This Python code reads the input from the standard input (sys.stdin.readline()), splits it into three integers, and then checks the conditions in the Java code. It prints the output to the standard output (print function).<｜end▁of▁sentence｜>

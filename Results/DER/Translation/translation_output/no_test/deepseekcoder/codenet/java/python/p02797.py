<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following java code to python and enclose your solution inside ```python```:
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

### Response:
```python
import sys

def main():
    N, K, S = map(int, sys.stdin.readline().split())
    if K == 0:
        if S == 10**9:
            print(' '.join(['1' for _ in range(N)]))
        else:
            S += 1
            print(' '.join([str(S) for _ in range(N)]))
    else:
        for i in range(N):
            if i < K:
                print(S, end=' ')
            else:
                if S == 10**9:
                    print('1', end=' ')
                else:
                    print(S + 1, end=' ')

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads three integers from the standard input, and then prints a sequence of integers to the standard output. The sequence is determined by the values of N, K, and S. The sequence is printed on a single line, with each integer separated by a space.
<|EOT|>

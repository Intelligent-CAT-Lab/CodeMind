<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
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

### Response:
```python
import sys

def solve(N, K, S):
    if K == 0:
        if S == 10**9:
            return [1]*N
        else:
            S += 1
            return [S]*N
    else:
        result = []
        for i in range(N):
            if i < K:
                result.append(S)
            else:
                if S == 10**9:
                    result.append(1)
                else:
                    result.append(S + 1)
        return result

N, K, S = map(int, sys.stdin.readline().split())
print(*solve(N, K, S))
```

This Python code reads the input from the standard input, converts it to the appropriate types, and then calls the `solve` function with the input parameters. The `solve` function returns a list of numbers, which are then printed to the standard output.
<|EOT|>

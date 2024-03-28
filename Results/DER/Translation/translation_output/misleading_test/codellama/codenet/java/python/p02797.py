<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

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
[/INST]

Here is the Python code that translates the Java code:
```python
import sys

N, K, S = map(int, sys.stdin.readline().split())

if K == 0:
    if S == 1000000000:
        for i in range(N):
            print(1, end=" ")
    else:
        S += 1
        for i in range(N):
            print(S, end=" ")
else:
    for i in range(N):
        if i < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print(1, end=" ")
            else:
                print(S + 1, end=" ")

# ãã³ãã¬
sys.stdin.close()
sys.stdout.flush()
```
Note that the Python code uses the `sys` module to read from standard input and write to standard output, and the `map` function to convert the input string to a list of integers. The `end` parameter in the `print` function is used to specify the end of the line, so that the output is formatted correctly.</s>

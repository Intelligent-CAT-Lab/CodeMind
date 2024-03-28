<s> [INST] Translate the following java code to python and enclose your solution inside ```python```:
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
```python
import sys

N, K, S = map(int, input().split())

if K == 0:
    if S == 1000000000:
        print("1" * N)
    else:
        S += 1
        print(S, end=" ")
        for _ in range(N - 1):
            print(S, end=" ")
else:
    for _ in range(N):
        if _ < K:
            print(S, end=" ")
        else:
            if S == 1000000000:
                print("1")
            else:
                print(S + 1, end=" ")
                print(" ", end="")
```</s>

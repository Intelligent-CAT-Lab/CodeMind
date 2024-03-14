Below is an instruction that describes a task. Write a response that appropriately completes the request.

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
import java.util.Scanner
import java.io.PrintWriter

public class p02797:
    def main(args):
        sc = Scanner(System.in)
        out = PrintWriter(System.out)
        N = Integer.parseInt(sc.next())
        K = Integer.parseInt(sc.next())
        S = Integer.parseInt(sc.next())
        if K == 0:
            if S == 1000000000:
                for i in range(N):
                    out.print("1 ")
            else:
                S += 1
                for i in range(N):
                    out.print(S + " ")
        else:
            for i in range(N):
                if i < K:
                    out.print(S + " ")
                else:
                    if S == 1000000000:
                        out.print("1 ")
                    else:
                        out.print(S + 1)
                        out.print(" ")

        #ãã³ãã¬
        sc.close()
        out.flush()
```<|endoftext|>

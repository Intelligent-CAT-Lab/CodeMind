<s> [INST] <<SYS>>
You are an expert python programmer and assistant
<</SYS>>

java code:

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

Translate the above java code to python.

python code:

[/INST]
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
```
This is the Python code that translates the Java code you provided. It uses the `map` function to convert the input from a string to a list of integers, and then uses a for loop to iterate over the list and print the output.

Note that the `end=" "` parameter in the `print` function is used to add a space after each number, which is what the Java code does.</s>

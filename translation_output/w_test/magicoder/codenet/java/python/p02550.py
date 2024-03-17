<｜begin▁of▁sentence｜>You are an exceptionally intelligent coding assistant that consistently delivers accurate and reliable responses to user instructions.

@@ Instruction
Translate the following java code to python and enclose your solution inside ```python```.
A sample test case is provided below:

Test input:
6 2 1001

Expected output:
1369


```
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class p02550 {
    static public void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        int X = sc.nextInt();
        int M = sc.nextInt();
        Set<Integer> used = new HashSet<>();
        ArrayList<Integer> A = new ArrayList<>();
        A.add(X);
        used.add(X);

        long K=0;
        long L=0;
        long ans = 0;
        boolean breakflag = false;

        for(int i = 0 ; i < M-1 && i < N-1 ; i++){
            long prev  = (long)A.get(i);
            int now = (int)((prev*prev) % M);
            if(now == 0){
                for(int j = 0 ; j <= i ; j++){
                    ans += A.get(j);
                }
                breakflag = true;
                break;
            }else if(used.contains(now)){
                L = i+1;
                for(int j = 0 ; j <= i ; j++){
                    if(A.get(j) == now){
                        K = j;
                        break;
                    }
                    ans += A.get(j);
                }

                long sub = 0;
                for(int j = (int)K ; j < L ; j++){
                    sub += A.get(j);
                }

                long m = (N-K) % (L-K);
                long left = 0;
                for(int j=0; j < m ; j++){
                    left += A.get((int)K + j);
                }

                ans += ((N-K)/(L-K))*sub + left;
                breakflag =true;
                break;
            }else{
                used.add(now);
                A.add(now);
            }
        }

        if(!breakflag){
            ans = 0;
            for(int a:A){
                ans += a;
            }
        }

        System.out.println(ans);
    }
}

```

@@ Response
```python
import sys

def main():
    N, X, M = map(int, sys.stdin.readline().split())
    used = {X}
    A = [X]
    K = L = 0
    ans = 0
    breakflag = False

    for i in range(M-1):
        prev = A[i]
        now = (prev*prev) % M
        if now == 0:
            ans += sum(A[:i+1])
            breakflag = True
            break
        elif now in used:
            L = i+1
            for j in range(i+1):
                if A[j] == now:
                    K = j
                    break
            ans += sum(A[:K])

            sub = sum(A[K:L])
            m = (N-K) % (L-K)
            left = sum(A[K:K+m])

            ans += ((N-K)//(L-K))*sub + left
            breakflag = True
            break
        else:
            used.add(now)
            A.append(now)

    if not breakflag:
        ans = sum(A)

    print(ans)

if __name__ == "__main__":
    main()
```

This Python code does the same thing as the Java code. It reads the input, performs the same calculations, and prints the result. The only difference is that Python uses a different syntax for input and output, and it uses the built-in `sum` function to calculate the sum of a list.<｜end▁of▁sentence｜>

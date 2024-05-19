System:
You are an expert java programmer and assistant

Question:
Translate the following code from python to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 6 -1 1 -1 9 2 3 4

Expected output:
1


```
def make_list(X) :
    if X!= -1 :
        x_list = [X]
    else :
        x_list = [i for i in range(1, 10)]
    return x_list

A, B, C, D, E, F, G, H, I = map(int, input().split())
a_list = make_list(A)
b_list = make_list(B)
c_list = make_list(C)
d_list = make_list(D)
e_list = make_list(E)
f_list = make_list(F)
g_list = make_list(G)
h_list = make_list(H)
i_list = make_list(I)

cnt = 0
for a in a_list :
    for b in b_list :
        if b not in [a]:
            for c in c_list :
                if c not in [a, b] :
                    for d in d_list :
                        if d not in [a, b, c] :
                            for e in e_list :
                                if e not in [a, b, c, d] :
                                    for f in f_list :
                                        if f not in [a, b, c, d, e] :
                                            for g in g_list :
                                                if g not in [a, b, c, d, e, f] :
                                                    for h in h_list :
                                                        if h not in [a, b, c, d, e, f, g] :
                                                            for i in i_list :
                                                                if i not in [a, b, c, d, e, f, g, h] :
                                                                    if a+10*b+c+100*d+10*e+f == 100*g+10*h+i :
                                                                        cnt += 1
print(cnt)

```


Answer:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < 10; i++) {
            X[i] = sc.nextInt();
        }
        int[] a_list = make_list(X[0]);
        int[] b_list = make_list(X[1]);
        int[] c_list = make_list(X[2]);
        int[] d_list = make_list(X[3]);
        int[] e_list = make_list(X[4]);
        int[] f_list = make_list(X[5]);
        int[] g_list = make_list(X[6]);
        int[] h_list = make_list(X[7]);
        int[] i_list = make_list(X[8]);

        int cnt = 0;
        for (int a : a_list) {
            for (int b : b_list) {
                if (b!= a) {
                    for (int c : c_list) {
                        if (c!= a && c!= b) {
                            for (int d : d_list) {
                                if (d!= a && d!= b && d!= c) {
                                    for (int e : e_list) {
                                        if (e!= a && e!= b && e!= c && e!= d) {
                                            for (int f : f_list) {
                                                if (f!= a && f!= b && f!= c && f!= d && f!= e) {
                                                    for (int g : g_list) {
                                                        if (g!= a && g!= b && g!= c && g!= d && g!= e && g!= f) {
                                                            for (int h : h_list) {
                                                                if (h!= a && h!= b && h!= c && h!= d && h!= e && h!= f && h!= g) {
                                                                    for (int i : i_list) {
                                                                        if (i!= a && i!= b && i!= c && i!= d && i!= e && i!= f && i!= g && i!= h) {
                                                                            if (a + 10 * b + c + 100 * d + 10 * e + f == 100 * g + 10 * h + i) {
                                                                                cnt += 1;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static int[] make_list(int X) {
        if (X!= -1) {
            int[] x_list = {X};
        } else {
            int[] x_list = new int[9];
            for (int i = 0; i < 9; i++) {
                x_list[i] = i + 1;
            }
        }
        return x_list;
    }
}
```<|endoftext|>

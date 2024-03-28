Below is an instruction that describes a task. Write a response that appropriately completes the request.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 6 -1 1 -1 9 2 3 4

Expected output:
0

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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();
        int I = sc.nextInt();

        List<Integer> a_list = makeList(A);
        List<Integer> b_list = makeList(B);
        List<Integer> c_list = makeList(C);
        List<Integer> d_list = makeList(D);
        List<Integer> e_list = makeList(E);
        List<Integer> f_list = makeList(F);
        List<Integer> g_list = makeList(G);
        List<Integer> h_list = makeList(H);
        List<Integer> i_list = makeList(I);

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
                                                                                cnt++;
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

    public static List<Integer> makeList(int X) {
        List<Integer> x_list;
        if (X!= -1) {
            x_list = new ArrayList<>();
            x_list.add(X);
        } else {
            x_list = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                x_list.add(i);
            }
        }
        return x_list;
    }
}
```<|endoftext|>

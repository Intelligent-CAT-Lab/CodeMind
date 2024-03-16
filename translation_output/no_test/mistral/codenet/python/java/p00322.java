<s> [INST] Translate the following python code to java and enclose your solution inside ```java```:
```
def make_list(X) :
    if X != -1 :
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
[/INST]
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] D = new int[10];
        int[] E = new int[10];
        int[] F = new int[10];
        int[] G = new int[10];
        int[] H = new int[10];
        int[] I = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
            E[i] = sc.nextInt();
            F[i] = sc.nextInt();
            G[i] = sc.nextInt();
            H[i] = sc.nextInt();
            I[i] = sc.nextInt();
        }

        int[] a_list = makeList(A);
        int[] b_list = makeList(B);
        int[] c_list = makeList(C);
        int[] d_list = makeList(D);
        int[] e_list = makeList(E);
        int[] f_list = makeList(F);
        int[] g_list = makeList(G);
        int[] h_list = makeList(H);
        int[] i_list = makeList(I);

        int cnt = 0;
        for (int a : a_list) {
            for (int b : b_list) {
                if (!Arrays.contains(b_list, b)) {
                    for (int c : c_list) {
                        if (!Arrays.contains(c_list, c)) {
                            for (int d : d_list) {
                                if (!Arrays.contains(d_list, d)) {
                                    for (int e : e_list) {
                                        if (!Arrays.contains(e_list, e)) {
                                            for (int f : f_list) {
                                                if (!Arrays.contains(f_list, f)) {
                                                    for (int g : g_list) {
                                                        if (!Arrays.contains(g_list, g)) {
                                                            for (int h : h_list) {
                                                                if (!Arrays.contains(h_list, h)) {
                                                                    for (int i : i_list) {
                                                                        if (!Arrays.contains(i_list, i)) {
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

    public static int[] makeList(int[] arr) {
        if (arr[0] != -1) {
            return new int[]{arr[0]};
        } else {
            return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
    }
}
```</s>

<s> [INST] Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 6 -1 1 -1 9 2 3 4

Expected output:
0

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
        int[] arr = new int[10];
        Arrays.fill(arr, -1);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        int G = sc.nextInt();
        int H = sc.nextInt();
        int I = sc.nextInt();

        List<Integer> aList = new ArrayList<>();
        List<Integer> bList = new ArrayList<>();
        List<Integer> cList = new ArrayList<>();
        List<Integer> dList = new ArrayList<>();
        List<Integer> eList = new ArrayList<>();
        List<Integer> fList = new ArrayList<>();
        List<Integer> gList = new ArrayList<>();
        List<Integer> hList = new ArrayList<>();
        List<Integer> iList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            aList.add(A);
            bList.add(B);
            cList.add(C);
            dList.add(D);
            eList.add(E);
            fList.add(F);
            gList.add(G);
            hList.add(H);
            iList.add(I);
        }

        int cnt = 0;
        for (int a : aList) {
            for (int b : bList) {
                if (!bList.contains(a)) {
                    for (int c : cList) {
                        if (!cList.contains(a) && !cList.contains(b)) {
                            for (int d : dList) {
                                if (!dList.contains(a) && !dList.contains(b) && !dList.contains(c)) {
                                    for (int e : eList) {
                                        if (!eList.contains(a) && !eList.contains(b) && !eList.contains(c) && !eList.contains(d)) {
                                            for (int f : fList) {
                                                if (!fList.contains(a) && !fList.contains(b) && !fList.contains(c) && !fList.contains(d) && !fList.contains(e)) {
                                                    for (int g : gList) {
                                                        if (!gList.contains(a) && !gList.contains(b) && !gList.contains(c) && !gList.contains(d) && !gList.contains(e) && !gList.contains(f)) {
                                                            for (int h : hList) {
                                                                if (!hList.contains(a) && !hList.contains(b) && !hList.contains(c) && !hList.contains(d) && !hList.contains(e) && !hList.contains(f) && !hList.contains(g)) {
                                                                    for (int i : iList) {
                                                                        if (!iList.contains(a) && !iList.contains(b) && !iList.contains(c) && !iList.contains(d) && !iList.contains(e) && !iList.contains(f) && !iList.contains(g) && !iList.contains(h)) {
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
}
```</s>

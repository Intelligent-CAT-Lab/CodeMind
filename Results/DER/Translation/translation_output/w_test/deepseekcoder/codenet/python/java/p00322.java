<｜begin▁of▁sentence｜>You are an expert Python programmer.Your task is to write a Python function to solve a programming problem.

### Instruction:
Translate the following python code to java and enclose your solution inside ```java```.
A sample test case is provided below:

Test input:
7 6 -1 1 -1 9 2 3 4

Expected output:
1


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

### Response:
```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> aList = makeList(scanner.nextInt());
        List<Integer> bList = makeList(scanner.nextInt());
        List<Integer> cList = makeList(scanner.nextInt());
        List<Integer> dList = makeList(scanner.nextInt());
        List<Integer> eList = makeList(scanner.nextInt());
        List<Integer> fList = makeList(scanner.nextInt());
        List<Integer> gList = makeList(scanner.nextInt());
        List<Integer> hList = makeList(scanner.nextInt());
        List<Integer> iList = makeList(scanner.nextInt());

        int cnt = 0;
        for (int a : aList) {
            for (int b : bList) {
                if (b != a) {
                    for (int c : cList) {
                        if (c != a && c != b) {
                            for (int d : dList) {
                                if (d != a && d != b && d != c) {
                                    for (int e : eList) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : fList) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g : gList) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h : hList) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i : iList) {
                                                                        if (i != a && i != b && i != c && i != d && i != e && i != f && i != g && i != h) {
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

    private static List<Integer> makeList(int x) {
        List<Integer> xList;
        if (x != -1) {
            xList = Arrays.asList(x);
        } else {
            xList = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                xList.add(i);
            }
        }
        return xList;
    }
}
```

This Java code does the same thing as the Python code. It reads integers from the standard input, creates lists of integers based on the input, and then iterates over these lists to count the number of combinations that satisfy the condition. The result is printed to the standard output.
<|EOT|>

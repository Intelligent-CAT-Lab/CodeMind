Here's the translated Java code for the provided Python script:

```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int D = scanner.nextInt();
        int E = scanner.nextInt();
        int F = scanner.nextInt();
        int G = scanner.nextInt();
        int H = scanner.nextInt();
        int I = scanner.nextInt();
        scanner.close();

        List<Integer> aList = makeList(A);
        List<Integer> bList = makeList(B);
        List<Integer> cList = makeList(C);
        List<Integer> dList = makeList(D);
        List<Integer> eList = makeList(E);
        List<Integer> fList = makeList(F);
        List<Integer> gList = makeList(G);
        List<Integer> hList = makeList(H);
        List<Integer> iList = makeList(I);

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

    private static List<Integer> makeList(int X) {
        if (X != -1) {
            return new ArrayList<>(Arrays.asList(X));
        } else {
            return IntStream.range(1, 10).boxed().collect(Collectors.toList());
        }
    }
}
```

This Java code performs the same operations as the given Python code. Please note that the way lists are created and checked for membership differs between Python and Java, which results in slightly different code for parts like `if (b != a)` instead of `if b not in [a]:` to check if an element is not in a list. The code also uses streams for generating the range of numbers from 1 to 9 when `X` is `-1`.

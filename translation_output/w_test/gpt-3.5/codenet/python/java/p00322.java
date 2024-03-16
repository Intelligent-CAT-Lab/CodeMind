```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static List<Integer> makeList(int X) {
        List<Integer> xList = new ArrayList<>();
        if (X != -1) {
            xList.add(X);
        } else {
            for (int i = 1; i <= 9; i++) {
                xList.add(i);
            }
        }
        return xList;
    }

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

        List<Integer> aList = makeList(A);
        List<Integer> bList = makeList(B);
        List<Integer> cList = makeList(C);
        List<Integer> dList = makeList(D);
        List<Integer> eList = makeList(E);
        List<Integer> fList = makeList(F);
        List<Integer> gList = makeList(G);
        List<Integer> hList = makeList(H);
        List<Integer> iList = makeList(I);

        int count = 0;
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
                                                                                count++;
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
        System.out.println(count);
    }
}
```


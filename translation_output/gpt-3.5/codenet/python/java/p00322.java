```java
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    
    public static ArrayList<Integer> makeList(int X) {
        ArrayList<Integer> xList = new ArrayList<>();
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

        ArrayList<Integer> aList = makeList(A);
        ArrayList<Integer> bList = makeList(B);
        ArrayList<Integer> cList = makeList(C);
        ArrayList<Integer> dList = makeList(D);
        ArrayList<Integer> eList = makeList(E);
        ArrayList<Integer> fList = makeList(F);
        ArrayList<Integer> gList = makeList(G);
        ArrayList<Integer> hList = makeList(H);
        ArrayList<Integer> iList = makeList(I);

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
                                                                            if (a + 10*b + c + 100*d + 10*e + f == 100*g + 10*h + i) {
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
```

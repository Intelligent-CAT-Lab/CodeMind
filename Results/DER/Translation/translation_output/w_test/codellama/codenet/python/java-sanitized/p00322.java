import java.util.Scanner;

public class p00322 {
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

        int[] aList = makeList(A);
        int[] bList = makeList(B);
        int[] cList = makeList(C);
        int[] dList = makeList(D);
        int[] eList = makeList(E);
        int[] fList = makeList(F);
        int[] gList = makeList(G);
        int[] hList = makeList(H);
        int[] iList = makeList(I);

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

    public static int[] makeList(int x) {
        if (x != -1) {
            int[] xList = new int[1];
            xList[0] = x;
            return xList;
        } else {
            int[] xList = new int[9];
            for (int i = 0; i < 9; i++) {
                xList[i] = i + 1;
            }
            return xList;
        }
    }
}
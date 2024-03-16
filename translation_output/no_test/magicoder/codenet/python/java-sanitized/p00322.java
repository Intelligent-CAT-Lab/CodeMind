import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class p00322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int A = input[0];
        int B = input[1];
        int C = input[2];
        int D = input[3];
        int E = input[4];
        int F = input[5];
        int G = input[6];
        int H = input[7];
        int I = input[8];

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

    private static List<Integer> makeList(int X) {
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
}
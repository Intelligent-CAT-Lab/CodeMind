import java.util.*;

public class p00322 {
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
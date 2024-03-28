import java.util.*;

public class p00322 {
    
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
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();
        int F = in.nextInt();
        int G = in.nextInt();
        int H = in.nextInt();
        int I = in.nextInt();
        in.close();
        
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
                if (a != b) {
                    for (int c : cList) {
                        if (c != b && c != a) {
                            for (int d : dList) {
                                if (d != c && d != b && d != a) {
                                    for (int e : eList) {
                                        if (e != d && e != c && e != b && e != a) {
                                            for (int f : fList) {
                                                if (f != e && f != d && f != c && f != b && f != a) {
                                                    for (int g : gList) {
                                                        if (g != f && g != e && g != d && g != c && g != b && g != a) {
                                                            for (int h : hList) {
                                                                if (h != g && h != f && h != e && h != d && h != c && h != b && h != a) {
                                                                    for (int i : iList) {
                                                                        if (i != h && i != g && i != f && i != e && i != d && i != c && i != b && i != a) {
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
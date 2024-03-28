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
        int cnt = 0;
        int[] a_list = make_list(A);
        int[] b_list = make_list(B);
        int[] c_list = make_list(C);
        int[] d_list = make_list(D);
        int[] e_list = make_list(E);
        int[] f_list = make_list(F);
        int[] g_list = make_list(G);
        int[] h_list = make_list(H);
        int[] i_list = make_list(I);
        for (int a : a_list) {
            for (int b : b_list) {
                if (b != a) {
                    for (int c : c_list) {
                        if (c != a && c != b) {
                            for (int d : d_list) {
                                if (d != a && d != b && d != c) {
                                    for (int e : e_list) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : f_list) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g : g_list) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h : h_list) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i : i_list) {
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

    public static int[] make_list(int X) {
        int[] x_list;
        if (X != -1) {
            x_list = new int[1];
            x_list[0] = X;
        } else {
            x_list = new int[9];
            for (int i = 0; i < 9; i++) {
                x_list[i] = i + 1;
            }
        }
        return x_list;
    }
}
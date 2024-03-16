import java.util.*;

public class p00322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];
        int[] D = new int[10];
        int[] E = new int[10];
        int[] F = new int[10];
        int[] G = new int[10];
        int[] H = new int[10];
        int[] I = new int[10];

        for (int i = 0; i < 10; i++) {
            A[i] = sc.nextInt();
            B[i] = sc.nextInt();
            C[i] = sc.nextInt();
            D[i] = sc.nextInt();
            E[i] = sc.nextInt();
            F[i] = sc.nextInt();
            G[i] = sc.nextInt();
            H[i] = sc.nextInt();
            I[i] = sc.nextInt();
        }

        int[] a_list = makeList(A);
        int[] b_list = makeList(B);
        int[] c_list = makeList(C);
        int[] d_list = makeList(D);
        int[] e_list = makeList(E);
        int[] f_list = makeList(F);
        int[] g_list = makeList(G);
        int[] h_list = makeList(H);
        int[] i_list = makeList(I);

        int cnt = 0;
        for (int a : a_list) {
            for (int b : b_list) {
                if (!Arrays.contains(b_list, b)) {
                    for (int c : c_list) {
                        if (!Arrays.contains(c_list, c)) {
                            for (int d : d_list) {
                                if (!Arrays.contains(d_list, d)) {
                                    for (int e : e_list) {
                                        if (!Arrays.contains(e_list, e)) {
                                            for (int f : f_list) {
                                                if (!Arrays.contains(f_list, f)) {
                                                    for (int g : g_list) {
                                                        if (!Arrays.contains(g_list, g)) {
                                                            for (int h : h_list) {
                                                                if (!Arrays.contains(h_list, h)) {
                                                                    for (int i : i_list) {
                                                                        if (!Arrays.contains(i_list, i)) {
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

    public static int[] makeList(int[] arr) {
        if (arr[0] != -1) {
            return new int[]{arr[0]};
        } else {
            return new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        }
    }
}
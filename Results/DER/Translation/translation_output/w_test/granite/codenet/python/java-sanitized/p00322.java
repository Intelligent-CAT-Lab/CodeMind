import java.util.*;

public class p00322 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] X = new int[10];
        for (int i = 0; i < 10; i++) {
            X[i] = sc.nextInt();
        }
        int[] a_list = make_list(X[0]);
        int[] b_list = make_list(X[1]);
        int[] c_list = make_list(X[2]);
        int[] d_list = make_list(X[3]);
        int[] e_list = make_list(X[4]);
        int[] f_list = make_list(X[5]);
        int[] g_list = make_list(X[6]);
        int[] h_list = make_list(X[7]);
        int[] i_list = make_list(X[8]);

        int cnt = 0;
        for (int a : a_list) {
            for (int b : b_list) {
                if (b!= a) {
                    for (int c : c_list) {
                        if (c!= a && c!= b) {
                            for (int d : d_list) {
                                if (d!= a && d!= b && d!= c) {
                                    for (int e : e_list) {
                                        if (e!= a && e!= b && e!= c && e!= d) {
                                            for (int f : f_list) {
                                                if (f!= a && f!= b && f!= c && f!= d && f!= e) {
                                                    for (int g : g_list) {
                                                        if (g!= a && g!= b && g!= c && g!= d && g!= e && g!= f) {
                                                            for (int h : h_list) {
                                                                if (h!= a && h!= b && h!= c && h!= d && h!= e && h!= f && h!= g) {
                                                                    for (int i : i_list) {
                                                                        if (i!= a && i!= b && i!= c && i!= d && i!= e && i!= f && i!= g && i!= h) {
                                                                            if (a + 10 * b + c + 100 * d + 10 * e + f == 100 * g + 10 * h + i) {
                                                                                cnt += 1;
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
        if (X!= -1) {
            int[] x_list = {X};
        } else {
            int[] x_list = new int[9];
            for (int i = 0; i < 9; i++) {
                x_list[i] = i + 1;
            }
        }
        return x_list;
    }
}
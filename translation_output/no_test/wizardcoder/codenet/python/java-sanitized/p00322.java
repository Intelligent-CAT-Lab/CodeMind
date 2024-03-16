import java.util.*;

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

        List<Integer> a_list = makeList(A);
        List<Integer> b_list = makeList(B);
        List<Integer> c_list = makeList(C);
        List<Integer> d_list = makeList(D);
        List<Integer> e_list = makeList(E);
        List<Integer> f_list = makeList(F);
        List<Integer> g_list = makeList(G);
        List<Integer> h_list = makeList(H);
        List<Integer> i_list = makeList(I);

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

    public static List<Integer> makeList(int X) {
        if (X == -1) {
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        } else {
            return Arrays.asList(X);
        }
    }
}
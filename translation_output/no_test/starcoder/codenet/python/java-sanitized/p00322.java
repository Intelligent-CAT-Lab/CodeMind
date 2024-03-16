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
        int cnt = 0;
        for (int a = A; a <= 9; a++) {
            for (int b = B; b <= 9; b++) {
                if (b!= a) {
                    for (int c = C; c <= 9; c++) {
                        if (c!= a && c!= b) {
                            for (int d = D; d <= 9; d++) {
                                if (d!= a && d!= b && d!= c) {
                                    for (int e = E; e <= 9; e++) {
                                        if (e!= a && e!= b && e!= c && e!= d) {
                                            for (int f = F; f <= 9; f++) {
                                                if (f!= a && f!= b && f!= c && f!= d && f!= e) {
                                                    for (int g = G; g <= 9; g++) {
                                                        if (g!= a && g!= b && g!= c && g!= d && g!= e && g!= f) {
                                                            for (int h = H; h <= 9; h++) {
                                                                if (h!= a && h!= b && h!= c && h!= d && h!= e && h!= f && h!= g) {
                                                                    for (int i = I; i <= 9; i++) {
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
}
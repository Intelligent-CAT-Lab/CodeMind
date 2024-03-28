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
        for (int a = 1; a <= A; a++) {
            for (int b = 1; b <= B; b++) {
                if (b!= a) {
                    for (int c = 1; c <= C; c++) {
                        if (c!= a && c!= b) {
                            for (int d = 1; d <= D; d++) {
                                if (d!= a && d!= b && d!= c) {
                                    for (int e = 1; e <= E; e++) {
                                        if (e!= a && e!= b && e!= c && e!= d) {
                                            for (int f = 1; f <= F; f++) {
                                                if (f!= a && f!= b && f!= c && f!= d && f!= e) {
                                                    for (int g = 1; g <= G; g++) {
                                                        if (g!= a && g!= b && g!= c && g!= d && g!= e && g!= f) {
                                                            for (int h = 1; h <= H; h++) {
                                                                if (h!= a && h!= b && h!= c && h!= d && h!= e && h!= f && h!= g) {
                                                                    for (int i = 1; i <= I; i++) {
                                                                        if (i!= a && i!= b && i!= c && i!= d && i!= e && i!= f && i!= g && i!= h) {
                                                                            if (a * 10 + b + c * 100 + d * 10 + e + f == g * 100 + h * 10 + i) {
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
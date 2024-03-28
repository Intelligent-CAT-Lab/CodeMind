import java.util.*;

public class p03913 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, A;
        N = sc.nextInt();
        A = sc.nextInt();
        int answer = 0;
        for (int k = 1; k < 50; k++) {
            int n = (int) Math.pow(N,
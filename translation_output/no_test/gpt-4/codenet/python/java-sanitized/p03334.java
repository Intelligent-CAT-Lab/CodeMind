import java.util.Scanner;
import java.util.function.BiFunction;

public class p03334 {
    static int n = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D1 = scanner.nextInt();
        int D2 = scanner.nextInt();
        
        BiFunction<Integer, Integer, Boolean> j1 = judge(D1);
        BiFunction<Integer, Integer, Boolean> j2 = judge(D2);
        
        int cnt = 0;
        for (int x = 0; x < N * 2; x++) {
            for (int y = 0; y < N * 2; y++) {
                if (j
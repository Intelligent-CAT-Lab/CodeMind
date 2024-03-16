import java.util.Scanner;

public class p03704 {
    
    public static long f(long d, int x, int y) {
        long n = Long.parseLong(new String(new char[x]).replace("\0", "9") + new String(new char[y]).replace("\0", "0"));
        if (x < 1) return d == 0 ? 1 : 0;
        long sum = 0;
        for (int i = -9; i <= 9; i++) {
            if (Math.abs(d + i * n) < n) {
                sum += f(d + i * n, x - 2, y + 1) * (10 - Math.abs(i) - (y < 1 ? 1 : 0));
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long D = Long.parseLong(scanner.nextLine());
        long totalSum = 0;
        for (int i = 1; i <= 20; i++) {
            totalSum += f(D, i, 0) * (10 - (i % 2) * 9);
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
import java.util.Scanner;

public class p01637 {
    public static boolean f(int a, int b, int c) {
        return a * b < 100 * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int m = scanner.nextInt();
        int rd = scanner.nextInt();
        int rr = scanner.nextInt();
        int cd = scanner.nextInt();
        int cr = scanner.nextInt();
        
        int ex = cd * 100 / rd;
        if(f(ex, rd, cd)) ex++;
        int ey = cr * 100 / rr;
        if(f(ey, rr, cr)) ey++;
        
        System.out.println(m - ex - ey >= 0 ? m - ex - ey : -1);
        
        scanner.close();
    }
}
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1 = scanner.nextInt();
        int a2 = scanner.nextInt();
        scanner.close();

        int t = 0;
        if (a1 == 1 && a2 == 1) {
            System.out.println(0);
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2 += 1;
                    a1 -= 2;
                } else {
                    a1 += 1;
                    a2 -= 2;
                }
                t += 1;
            }
            System.out.println(t);
        }
    }
}
import java.util.Scanner;

public class codeforces_651_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a1, a2;
        a1 = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        a2 = Integer.parseInt(scanner.nextLine().split(" ")[0]);
        int t = 0;
        if (a1 == 1 && a2 == 1) {
            t = 0;
        } else {
            while (a1 > 0 && a2 > 0) {
                if (a1 > a2) {
                    a2++;
                    a1--;
                } else {
                    a2--;
                    a1++;
                }
                t++;
            }
        }
        System.out.println(t);
    }
}
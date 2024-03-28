import java.util.Scanner;

public class codeforces_242_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = 0;
        for (int i = a; i <= x; i++) {
            for (int j = b; j <= y; j++) {
                if (i > j) {
                    c++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(c);
    }
}
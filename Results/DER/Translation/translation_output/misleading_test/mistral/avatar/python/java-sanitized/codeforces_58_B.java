import java.util.Scanner;

public class codeforces_58_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i > 1; i--) {
            if (a % i == 0) {
                System.out.print(i + "  ");
                a = i;
            }
        }
    }
}


Sample test case:

Test input:
733035

Expected output:
732989 244387 48927 23
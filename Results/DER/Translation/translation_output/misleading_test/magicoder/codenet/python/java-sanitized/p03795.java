import java.util.Scanner;

public class p03795 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        System.out.println(800*N-200*(N/15));
    }
}


You can test this code with the following test case:

Test input:
20

Expected output:
15796
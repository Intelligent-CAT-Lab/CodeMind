import java.util.Scanner;

public class p02612 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n % 1000 != 0) {
            System.out.println(1000 - n % 1000);
        } else {
            System.out.println(0);
        }
    }
}


You can test this code with the following test case:

Test input:
1900

Expected output:
102
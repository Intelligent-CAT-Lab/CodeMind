import java.util.Scanner;

public class p02391 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        scanner.close();

        if (a < b) {
            System.out.println('a' + " < " + 'b');
        } else if (a > b) {
            System.out.println('a' + " > " + 'b');
        } else {
            System.out.println('a' + " == " + 'b');
        }
    }
}



Test input:
1 2

Expected output:
a < b
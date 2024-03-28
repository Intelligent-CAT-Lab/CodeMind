import java.util.Scanner;

public class p03085 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char b = scanner.next().charAt(0);
        if (b == 'A') {
            System.out.println('T');
        } else if (b == 'C') {
            System.out.println('G');
        } else if (b == 'G') {
            System.out.println('C');
        } else {
            System.out.println('A');
        }
    }
}

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        if (a + b > 0) {
            System.out.println("1");
        } else if (a + b < 0) {
            System.out.println("-1");
        } else {
            System.out.println("0");
        }
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
var newVariable_0 = sc.hasNextInt();        while (newVariable_0) {
            int H = sc.nextInt();
            int R = sc.nextInt();

var newVariable_1 = Math.abs(H);            if ( H < 0 && newVariable_1 == R ) {
                System.out.println(0);
            } else if ( H + R > 0 ) {
                System.out.println(1);
            } else {
                System.out.println(-1);
            }
        }
    }
}


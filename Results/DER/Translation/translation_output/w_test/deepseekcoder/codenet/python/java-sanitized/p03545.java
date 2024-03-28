import java.util.Scanner;

public class p03545 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.next();

        int a = Integer.parseInt(String.valueOf(n.charAt(0)));
        int b = Integer.parseInt(String.valueOf(n.charAt(1)));
        int c = Integer.parseInt(String.valueOf(n.charAt(2)));
        int d = Integer.parseInt(String.valueOf(n.charAt(3)));

        if ((a+b+c+d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if ((a+b+c-d) == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if ((a+b-c+d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if ((a+b-c-d) == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if ((a-b+c+d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if ((a-b+c-d) == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if ((a-b-c+d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if ((a-b-c-d) == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
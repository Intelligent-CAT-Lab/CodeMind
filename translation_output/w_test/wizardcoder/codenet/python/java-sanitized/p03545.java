import java.util.Scanner;

public class p03545 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int a = Integer.parseInt(n.charAt(0) + "");
        int b = Integer.parseInt(n.charAt(1) + "");
        int c = Integer.parseInt(n.charAt(2) + "");
        int d = Integer.parseInt(n.charAt(3) + "");

        if (a+b+c+d == 7) {
            System.out.println(a + "+" + b + "+" + c + "+" + d + "=7");
        } else if (a+b+c-d == 7) {
            System.out.println(a + "+" + b + "+" + c + "-" + d + "=7");
        } else if (a+b-c+d == 7) {
            System.out.println(a + "+" + b + "-" + c + "+" + d + "=7");
        } else if (a+b-c-d == 7) {
            System.out.println(a + "+" + b + "-" + c + "-" + d + "=7");
        } else if (a-b+c+d == 7) {
            System.out.println(a + "-" + b + "+" + c + "+" + d + "=7");
        } else if (a-b+c-d == 7) {
            System.out.println(a + "-" + b + "+" + c + "-" + d + "=7");
        } else if (a-b-c+d == 7) {
            System.out.println(a + "-" + b + "-" + c + "+" + d + "=7");
        } else if (a-b-c-d == 7) {
            System.out.println(a + "-" + b + "-" + c + "-" + d + "=7");
        }
    }
}
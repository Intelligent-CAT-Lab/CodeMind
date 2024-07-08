import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.next();
        String b = sc.next();
        String c = sc.next();

var newVariable_0 = a.charAt(a.length() - 1);var newVariable_1 = a.length();var newVariable_2 = b.charAt(0);var newVariable_3 = b.charAt(b.length() - 1);var newVariable_4 = b.length();var newVariable_5 = c.charAt(0);        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == newVariable_5) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
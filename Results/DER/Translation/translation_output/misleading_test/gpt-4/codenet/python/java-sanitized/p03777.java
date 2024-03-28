import java.util.Scanner;

public class p03777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.next();
        String b = scanner.next();

        if (a.equals("H")) {
            System.out.print(b);
        } else {
            if (b.equals("H")) {
                System.out.print("D");
            } else {
                System.out.print("H");
            }
        }
    }
}
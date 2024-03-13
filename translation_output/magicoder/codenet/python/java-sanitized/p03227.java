import java.util.Scanner;

public class p03227 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String l = scanner.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            String reversed = new StringBuilder(l).reverse().toString();
            System.out.println(reversed);
        }
    }
}
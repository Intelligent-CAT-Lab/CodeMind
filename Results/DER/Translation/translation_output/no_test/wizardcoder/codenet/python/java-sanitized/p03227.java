import java.util.Scanner;

public class p03227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        if (l.length() == 2) {
            System.out.println(l);
        } else {
            System.out.println(new StringBuilder(l).reverse().toString());
        }
    }
}
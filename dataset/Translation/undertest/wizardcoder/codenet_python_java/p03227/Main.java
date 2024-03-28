import java.util.Scanner;

public class p03227 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if (str.length() == 2) {
            System.out.println(str);
        } else {
            System.out.println(new StringBuilder(str).reverse().toString());
        }
    }
}
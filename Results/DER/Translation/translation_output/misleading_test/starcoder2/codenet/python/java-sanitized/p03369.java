import java.util.Scanner;

public class p03369 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(700 + 100 * s.length() - 200 * s.replace("o", "").length());
    }
}
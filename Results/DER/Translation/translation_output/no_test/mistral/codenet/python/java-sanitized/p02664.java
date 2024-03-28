import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '?') {
                a = a.substring(0, i) + "D" + a.substring(i + 1);
            }
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
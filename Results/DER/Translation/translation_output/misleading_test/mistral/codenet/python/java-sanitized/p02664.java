import java.util.Scanner;

public class p02664 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        a = a.replaceAll("\\?", "D");
        String b = "";
        for (int i = 0; i < a.length(); i++) {
            b += a.charAt(i);
        }
        System.out.println(b);
    }
}
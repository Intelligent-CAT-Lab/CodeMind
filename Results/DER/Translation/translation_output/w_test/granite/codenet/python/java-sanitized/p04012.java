import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < alfa.length(); i++) {
            char c = alfa.charAt(i);
            if (w.length() - w.replaceAll(String.valueOf(c), "").length() % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
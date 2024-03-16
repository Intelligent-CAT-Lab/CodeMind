import java.util.Scanner;

public class p04012 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String w = scanner.nextLine();
        String Alfa = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < Alfa.length(); i++) {
            if (w.indexOf(Alfa.charAt(i)) % 2 == 1) {
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
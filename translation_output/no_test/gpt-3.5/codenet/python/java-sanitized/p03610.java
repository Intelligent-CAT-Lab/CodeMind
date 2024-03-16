import java.util.Scanner;

public class p03610 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length(); i += 2) {
            System.out.print(s.charAt(i));
        }
    }
}
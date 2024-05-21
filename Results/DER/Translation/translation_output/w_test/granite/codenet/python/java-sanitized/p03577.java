import java.util.Scanner;

public class p03577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(s.substring(0, s.length() - 8));
    }
}
import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String ans = "";
        if (input.equals("7") || input.equals("5") || input.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }
        System.out.println(ans);
    }
}
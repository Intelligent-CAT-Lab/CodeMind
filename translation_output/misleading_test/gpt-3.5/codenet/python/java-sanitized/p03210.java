import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.next();

        String ans;
        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);
    }
}
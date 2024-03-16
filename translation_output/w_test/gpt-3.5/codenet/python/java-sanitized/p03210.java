import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String x = scanner.nextLine();

        String ans;
        if (x.equals("7") || x.equals("5") || x.equals("3")) {
            ans = "YES";
        } else {
            ans = "NO";
        }

        System.out.println(ans);
    }
}
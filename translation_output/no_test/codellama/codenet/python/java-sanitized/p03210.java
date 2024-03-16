import java.util.Scanner;

public class p03210 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String X = scanner.nextLine();

        if (X.equals("7") || X.equals("5") || X.equals("3")) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
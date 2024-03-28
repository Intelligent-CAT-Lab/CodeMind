import java.util.Scanner;

public class p02835 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        String result = (a + b + c < 22) ? "win" : "bust";
        System.out.println(result);
    }
}
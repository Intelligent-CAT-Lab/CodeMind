import java.util.Scanner;

public class p02711 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (String.valueOf(N).contains("7")) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
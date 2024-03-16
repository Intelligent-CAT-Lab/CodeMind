import java.util.Scanner;

public class p00375 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = Integer.parseInt(scanner.nextLine());
        int y = (x - 30) / 2;
        System.out.println(y);
        scanner.close();
    }
}
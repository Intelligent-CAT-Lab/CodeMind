import java.util.Scanner;

public class p02111 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int doubledInput = input * 2;
        int minutes = doubledInput / 60;
        int seconds = doubledInput % 60;

        System.out.println(minutes + " " + seconds);
        scanner.close();
    }
}
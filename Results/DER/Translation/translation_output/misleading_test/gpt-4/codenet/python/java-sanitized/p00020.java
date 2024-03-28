import java.util.Scanner;

public class p00020 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String uppercaseLine = inputLine.toUpperCase();
        System.out.println(uppercaseLine);
        scanner.close();
    }
}
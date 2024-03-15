import java.util.Scanner;

public class p03992 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = scanner.nextLine();
        System.out.println(s.substring(0, 4) + " " + s.substring(4));
    }
}
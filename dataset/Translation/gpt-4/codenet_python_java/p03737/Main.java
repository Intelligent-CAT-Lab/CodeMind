import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] parts = scanner.nextLine().toUpperCase().split(" ");
        System.out.println(parts[0].charAt(0) + "" + parts[1].charAt(0) + "" + parts[2].charAt(0));
        scanner.close();
    }
}
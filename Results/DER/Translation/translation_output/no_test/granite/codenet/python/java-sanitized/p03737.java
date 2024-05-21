import java.util.Scanner;

public class p03737 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().toUpperCase().split(" ");
        System.out.println(strings[0].charAt(0) + strings[1].charAt(0) + strings[2].charAt(0));
    }
}
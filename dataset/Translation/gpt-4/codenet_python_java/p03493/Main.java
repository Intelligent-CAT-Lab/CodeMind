import java.util.Scanner;

public class p03493 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        long count = input.chars().filter(ch -> ch == '1').count();
        System.out.println(count);
        scanner.close();
    }
}
import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        String year = String.valueOf(Integer.parseInt(date.substring(0, 4)) + 1);
        System.out.println(year + date.substring(4));
    }
}
import java.util.Scanner;

public class p03469 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String modifiedDate = "2018" + inputDate.substring(4);
        System.out.println(modifiedDate);
        scanner.close();
    }
}
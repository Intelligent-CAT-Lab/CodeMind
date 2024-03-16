import java.util.Scanner;

public class p03636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(",");
        String a = arr[0];
        String b = arr[1];
        String c = arr[2];
        System.out.println(a + b.length() + c);
    }
}
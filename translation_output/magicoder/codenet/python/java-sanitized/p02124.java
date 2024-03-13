import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int division = input / 100;
        String result = "ai1333" + "3".repeat(division);
        System.out.println(result);
    }
}
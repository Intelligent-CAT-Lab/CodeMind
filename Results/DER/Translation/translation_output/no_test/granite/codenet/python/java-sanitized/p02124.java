import java.util.Scanner;

public class p02124 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result = input / 100;
        String output = "ai1333" + String.valueOf(result);
        System.out.println(output);
    }
}
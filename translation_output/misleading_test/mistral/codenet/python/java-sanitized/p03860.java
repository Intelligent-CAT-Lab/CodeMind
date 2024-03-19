import java.util.Scanner;

public class p03860 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String a = split[0];
        String x = split[1];
        String c = split[2];
        System.out.println(a + x[0] + c);
    }
}
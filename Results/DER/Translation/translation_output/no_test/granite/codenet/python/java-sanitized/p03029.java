import java.util.Scanner;

public class p03029 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int p = Integer.parseInt(input[1]);
        int result = (3 * a + p) / 2;
        System.out.println(result);
    }
}
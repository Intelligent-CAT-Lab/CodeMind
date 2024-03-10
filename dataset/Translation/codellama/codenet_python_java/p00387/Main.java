import java.util.Scanner;

public class p00387 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int kimawasi = B / A;
        if (B % A > 0) {
            kimawasi++;
        }
        System.out.println(kimawasi);
    }
}
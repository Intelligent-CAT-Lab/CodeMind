import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int X = Integer.parseInt(input[0]);
        int Y = Integer.parseInt(input[1]);

        int k = (int) (Math.log(Y / (double) X) / Math.log(2));
        System.out.println(k);
    }
}
import java.util.Scanner;

public class p02017 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int W = Integer.parseInt(input[1]);
        int X = Integer.parseInt(input[2]);
        int Y = Integer.parseInt(input[3]);

        if ((H * W) * (X + Y) % 2 != 0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }
}
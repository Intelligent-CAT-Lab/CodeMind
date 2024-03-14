import java.util.Scanner;

public class p00399 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int r = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int w = Integer.parseInt(input[2]);
        int g = Integer.parseInt(input[3]);
        System.out.println(r + b + w + g);
    }
}
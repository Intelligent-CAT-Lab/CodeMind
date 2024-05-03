import java.util.Scanner;

public class p02783 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int A = Integer.parseInt(input[1]);
        System.out.println((int) Math.ceil((double) H / A));
    }
}
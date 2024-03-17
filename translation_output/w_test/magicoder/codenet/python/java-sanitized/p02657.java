import java.util.Scanner;

public class p02657 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int L = Integer.parseInt(input[0]);
        int R = Integer.parseInt(input[1]);
        System.out.println(L * R);
    }
}
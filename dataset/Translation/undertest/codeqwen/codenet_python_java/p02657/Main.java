import java.util.Scanner;

public class p02657 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int L = Integer.parseInt(parts[0]);
        int R = Integer.parseInt(parts[1]);
        System.out.println(L * R);
    }
}
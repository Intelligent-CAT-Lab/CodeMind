import java.util.Scanner;

public class p03219 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int ab = Integer.parseInt(input[0]);
        int bc = Integer.parseInt(input[1]);

        int fare = ab + (bc / 2);

        System.out.println(fare);
    }
}
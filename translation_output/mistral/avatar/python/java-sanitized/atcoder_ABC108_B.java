import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1: ");
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int x1 = Integer.parseInt(split[0]);
        int y1 = Integer.parseInt(split[1]);
        System.out.print("Enter x2 y2: ");
        input = scanner.nextLine();
        split = input.split(" ");
        int x2 = Integer.parseInt(split[0]);
        int y2 = Integer.parseInt(split[1]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
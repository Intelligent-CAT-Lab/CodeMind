import java.util.Scanner;

public class atcoder_ABC108_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x1, y1, x2, y2;
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        x1 = Integer.parseInt(split[0]);
        y1 = Integer.parseInt(split[1]);
        x2 = Integer.parseInt(split[2]);
        y2 = Integer.parseInt(split[3]);
        int a = x2 - x1;
        int b = y2 - y1;
        System.out.println(x2 - b + " " + y2 + a + " " + x1 - b + " " + y1 + a);
    }
}
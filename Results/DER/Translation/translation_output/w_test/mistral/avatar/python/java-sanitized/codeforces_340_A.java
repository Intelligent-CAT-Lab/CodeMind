import java.util.Scanner;

public class codeforces_340_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int a = Integer.parseInt(split[2]);
        int b = Integer.parseInt(split[3]);
        int lcm = findLCM(x, y);
        int result = (b - a + 1) / lcm;
        System.out.println(result);
    }

    public static int findLCM(int x, int y) {
        while (x % y != 0) {
            int temp = x;
            x = y;
            y = temp % y;
        }
        return y;
    }
}
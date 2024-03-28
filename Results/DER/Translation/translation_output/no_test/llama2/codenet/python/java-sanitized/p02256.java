Solution


import java.util.Scanner;

public class p02256 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if (x > y) {
            x = y;
            y = x;
        }
        while (x % y != 0) {
            x = y;
            y = x % y;
        }
        System.out.println(y);
    }
}
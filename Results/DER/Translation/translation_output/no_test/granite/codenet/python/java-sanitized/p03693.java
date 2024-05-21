import java.util.Scanner;

public class p03693 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] rgb = scanner.nextLine().split(" ");
        int r = Integer.parseInt(rgb[0]);
        int g = Integer.parseInt(rgb[1]);
        int b = Integer.parseInt(rgb[2]);

        if ((g * 10 + b) % 4 == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
import java.util.Scanner;

public class p03623 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, a, b;
        x = scanner.nextInt();
        a = scanner.nextInt();
        b = scanner.nextInt();
        String result = (Math.abs(x - a) < Math.abs(x - b)) ? "A" : "B";
        System.out.println(result);
    }
}
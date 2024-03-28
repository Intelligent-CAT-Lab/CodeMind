import java.util.Scanner;
public class p02379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1, y1, x2, y2;
        x1 = Double.parseDouble(scanner.nextLine().split(" ")[0]);
        y1 = Double.parseDouble(scanner.nextLine().split(" ")[1]);
        x2 = Double.parseDouble(scanner.nextLine().split(" ")[0]);
        y2 = Double.parseDouble(scanner.nextLine().split(" ")[1]);
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("%.2f", distance);
    }
}
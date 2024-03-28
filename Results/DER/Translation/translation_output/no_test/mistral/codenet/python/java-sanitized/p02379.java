import java.util.Scanner;
public class p02379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter x1 y1 x2 y2 separated by spaces: ");
        String input = scanner.nextLine();
        String[] values = input.split(" ");
        double x1 = Double.parseDouble(values[0]);
        double y1 = Double.parseDouble(values[1]);
        double x2 = Double.parseDouble(values[2]);
        double y2 = Double.parseDouble(values[3]);
        double distance = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));
        System.out.printf("Distance between (%f, %f) and (%f, %f) is: %f%n", x1, y1, x2, y2, distance);
    }
}
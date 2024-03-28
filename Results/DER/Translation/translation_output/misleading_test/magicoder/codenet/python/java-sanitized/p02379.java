import java.util.Scanner;

public class p02379 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        double x1 = Double.parseDouble(input[0]);
        double y1 = Double.parseDouble(input[1]);
        double x2 = Double.parseDouble(input[2]);
        double y2 = Double.parseDouble(input[3]);
        double distance = Math.sqrt(Math.pow((x1 - x2), 2) + Math.pow((y1 - y2), 2));
        System.out.printf("%.15f", distance);
    }
}
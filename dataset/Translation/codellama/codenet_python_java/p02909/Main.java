import java.util.Scanner;

public class p02909 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weather = scanner.nextLine();

        if (weather.equals("Sunny")) {
            System.out.println("Cloudy");
        } else if (weather.equals("Cloudy")) {
            System.out.println("Rainy");
        } else {
            System.out.println("Sunny");
        }
    }
}
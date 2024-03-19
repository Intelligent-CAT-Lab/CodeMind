import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();
        int week = 0;
        switch (input) {
            case "SUN":
                week = 0;
                break;
            case "MON":
                week = 1;
                break;
            case "TUE":
                week = 2;
                break;
            case "WED":
                week = 3;
                break;
            case "THU":
                week = 4;
                break;
            case "FRI":
                week = 5;
                break;
            case "SAT":
                week = 6;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(7 - week);
    }
}
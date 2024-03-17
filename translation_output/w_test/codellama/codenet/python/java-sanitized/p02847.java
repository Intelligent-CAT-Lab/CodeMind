import java.util.Scanner;

public class p02847 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String day = scanner.nextLine().trim();
        int week = 0;
        switch (day) {
            case "SUN":
                week = 6;
                break;
            case "MON":
                week = 0;
                break;
            case "TUE":
                week = 1;
                break;
            case "WED":
                week = 2;
                break;
            case "THU":
                week = 3;
                break;
            case "FRI":
                week = 4;
                break;
            case "SAT":
                week = 5;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println(7 - week);
    }
}
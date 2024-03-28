import java.util.Scanner;

public class p03206 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        String output = "";
        switch (input) {
            case 25:
                output = "Christmas";
                break;
            case 24:
                output = "Christmas Eve";
                break;
            case 23:
                output = "Christmas Eve Eve";
                break;
            case 22:
                output = "Christmas Eve Eve Eve";
                break;
            default:
                output = "Invalid input";
                break;
        }
        System.out.println(output);
    }
}
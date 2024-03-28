import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();

        String[] O = {"1 1 0", "0 0 1"};

        for (String s : O) {
            if (B.equals(s)) {
                System.out.println("Open");
                break;
            }
        }

        if (B.equals("1 1 0") || B.equals("0 0 1")) {
            System.out.println("Close");
        }
    }
}
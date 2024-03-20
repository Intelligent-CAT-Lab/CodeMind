import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();
        String[] O = {"1 1 0", "0 0 1"};
        if (B.equals(O[0]) || B.equals(O[1])) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
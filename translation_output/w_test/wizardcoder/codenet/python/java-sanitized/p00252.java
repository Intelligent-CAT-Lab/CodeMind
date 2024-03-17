import java.util.Scanner;

public class p00252 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String B = sc.nextLine();
        String[] O = {"1 1 0", "0 0 1"};
        boolean isOpen = false;
        for (String s : O) {
            if (B.equals(s)) {
                isOpen = true;
                break;
            }
        }
        if (isOpen) {
            System.out.println("Open");
        } else {
            System.out.println("Close");
        }
    }
}
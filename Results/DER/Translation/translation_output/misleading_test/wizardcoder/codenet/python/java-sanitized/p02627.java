import java.util.Scanner;

public class p02627 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();

        if (n.equals("B")) {
            System.out.println("A");
        } else if (n.equals("b")) {
            System.out.println("a");
        }
    }
}
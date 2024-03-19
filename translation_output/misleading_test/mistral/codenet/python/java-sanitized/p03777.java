import java.util.Scanner;

public class p03777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] split = input.split(" ");
        String a = split[0];
        String b = split[1];

        if (a.equals("H")) {
            System.out.println(b);
        } else {
            if (b.equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
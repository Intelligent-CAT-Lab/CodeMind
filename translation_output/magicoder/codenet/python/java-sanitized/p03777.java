import java.util.Scanner;

public class p03777 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");

        if (input[0].equals("H")) {
            System.out.println(input[1]);
        } else {
            if (input[1].equals("H")) {
                System.out.println("D");
            } else {
                System.out.println("H");
            }
        }
    }
}
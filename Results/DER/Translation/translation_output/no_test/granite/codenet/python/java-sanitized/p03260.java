import java.util.Scanner;

public class p03260 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        if (a % 2!= 0 && b % 2!= 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
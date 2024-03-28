import java.util.Scanner;

public class p02789 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] a = input.split(" ");
        int first = Integer.parseInt(a[0]);
        int second = Integer.parseInt(a[1]);
        if (first == second) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
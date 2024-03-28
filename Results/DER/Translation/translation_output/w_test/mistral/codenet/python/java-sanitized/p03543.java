import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] arr = input.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int d = Integer.parseInt(arr[3]);
        if (a == b == c || b == c == d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
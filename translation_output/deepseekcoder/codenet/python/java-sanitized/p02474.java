import java.util.Scanner;

public class p02474 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] a = scanner.nextLine().split(" ");
        System.out.println(Integer.parseInt(a[0]) * Integer.parseInt(a[1]));
    }
}
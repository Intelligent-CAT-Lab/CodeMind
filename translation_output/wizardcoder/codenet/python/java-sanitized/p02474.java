import java.util.Scanner;

public class p02474 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(a[0]);
        int num2 = Integer.parseInt(a[1]);
        System.out.println(num1 * num2);
    }
}
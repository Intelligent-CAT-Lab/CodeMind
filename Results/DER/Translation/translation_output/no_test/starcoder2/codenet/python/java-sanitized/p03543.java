import java.util.Scanner;

public class p03543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String N = sc.nextLine();
        char[] a = N.toCharArray();
        if (a[0] == a[1] && a[1] == a[2] || a[1] == a[2] && a[2] == a[3]) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
import java.util.Scanner;

public class p03729 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        String a = arr[0];
        String b = arr[1];
        String c = arr[2];

        if (a.charAt(a.length() - 1) == b.charAt(0) && b.charAt(b.length() - 1) == c.charAt(0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
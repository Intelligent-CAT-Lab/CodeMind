import java.util.Scanner;

public class p03437 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = (x % y == 0)? x : -1;
        System.out.println(result);
    }
}
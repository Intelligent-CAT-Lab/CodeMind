import java.util.Scanner;

public class p03609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int t = sc.nextInt();
        int result = (x - t > 0)? x - t : 0;
        System.out.println(result);
    }
}
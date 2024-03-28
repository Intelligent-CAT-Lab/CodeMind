import java.util.Scanner;
import java.lang.Math;

public class p02783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        System.out.println(Math.ceil(H/A));
    }
}
import java.util.Scanner;

public class p02783 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int A = sc.nextInt();
        int result = (int) Math.ceil(H / A);
        System.out.println(result);
    }
}
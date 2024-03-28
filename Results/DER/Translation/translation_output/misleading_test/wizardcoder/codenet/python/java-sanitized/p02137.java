import java.util.Scanner;

public class p02137 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = (int) Math.floor(num / 500.0) * 500;
        System.out.println(result);
    }
}
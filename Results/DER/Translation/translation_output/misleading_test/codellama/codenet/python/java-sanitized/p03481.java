import java.util.Scanner;

public class p03481 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int k = (Y / X).bitLength();
        System.out.println(k);
    }
}
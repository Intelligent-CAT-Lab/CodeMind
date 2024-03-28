import java.util.Scanner;

public class p03351 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("YNeos"[not (abs(a-c)<=d or abs(a-b)<=d and abs(b-c)<=d)::2]);
    }
}
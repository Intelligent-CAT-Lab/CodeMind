import java.util.Scanner;

public class p02717 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        int a = x;
        int b = y;
        int c = z;

        b = x;
        c = y;
        a = z;

        System.out.println(a + " " + b + " " + c);
    }
}
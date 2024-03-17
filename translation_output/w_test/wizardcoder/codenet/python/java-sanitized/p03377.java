import java.util.Scanner;

public class p03377 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        if(a<=x && a+b>=x) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
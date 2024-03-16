import java.util.Scanner;

public class p02743 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (c-a-b < 0) {
            System.out.println("No");
        } else {
            if (4*a*b < (c-a-b)*(c-a-b)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
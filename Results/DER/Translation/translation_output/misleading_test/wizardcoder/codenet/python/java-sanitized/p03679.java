import java.util.Scanner;

public class p03679 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (b <= a) {
            System.out.println("delicious");
        } else if (b - a <= x) {
            System.out.println("safe");
        } else {
            System.out.println("dangerous");
        }
    }
}
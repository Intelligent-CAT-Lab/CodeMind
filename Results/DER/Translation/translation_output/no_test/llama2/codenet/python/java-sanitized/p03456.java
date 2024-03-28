import java.util.Scanner;

public class p03456 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        int n = Integer.parseInt(a + b);
        int sqrtn = (int) Math.sqrt(n);
        int i = 1;
        for (i = 1; i <= sqrtn; i++) {
            if (i * i == n) {
                System.out.println("Yes");
                break;
            }
        }
        else {
            System.out.println("No");
        }
    }
}
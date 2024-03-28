import java.util.Scanner;

public class p02766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int i = 0;

        while (n / k > 0) {
            i++;
            n /= k;
        }

        System.out.println(i);
    }
}
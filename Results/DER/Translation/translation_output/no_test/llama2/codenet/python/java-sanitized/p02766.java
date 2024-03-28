import java.util.Scanner;

public class p02766 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();
        int i = 0;
        while (n / k ** i != 0) {
            i++;
        }
        System.out.println(i);
    }
}
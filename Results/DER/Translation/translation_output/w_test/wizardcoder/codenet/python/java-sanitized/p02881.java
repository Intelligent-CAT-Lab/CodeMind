import java.util.Scanner;

public class p02881 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int i = 1;
        while (i <= n) {
            if (n % i == 0) {
                int j = n / i;
                if (j == i) {
                    i++;
                } else {
                    System.out.println(i + j);
                    break;
                }
            } else {
                i++;
            }
        }
    }
}
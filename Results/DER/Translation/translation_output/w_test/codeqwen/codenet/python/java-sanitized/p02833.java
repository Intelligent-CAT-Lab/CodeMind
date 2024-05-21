import java.util.*;

public class p02833 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int div = 10;
        int tot = 0;
        if (n % 2 == 1) {
            System.out.println(0);
        } else {
            while (n >= div) {
                tot += (n / div);
                div *= 5;
            }
            System.out.println(tot);
        }
    }
}
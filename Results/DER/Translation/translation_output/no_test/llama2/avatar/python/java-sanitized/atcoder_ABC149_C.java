import java.util.Scanner;

public class atcoder_ABC149_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean flag = true;
        for (int i = 2; i <= (int)Math.sqrt(n) + 2; i++) {
            if (n % i == 0) {
                flag = false;
                break;
            }
        }
        while (flag) {
            if (hoge(n)) {
                System.out.println(n);
                break;
            }
            n++;
        }
    }
}
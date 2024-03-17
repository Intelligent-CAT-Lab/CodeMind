import java.util.Scanner;

public class p03896 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n - 2; i++) {
            String s = "";
            for (int j = 0; j < n - 1; j++) {
                int k = (i - (~(j ^ (n % 2 < (j + 2 < n - i * 2)))) % n + 1) % n + 1;
                s += k + " ";
            }
            System.out.println(s);
        }
    }
}
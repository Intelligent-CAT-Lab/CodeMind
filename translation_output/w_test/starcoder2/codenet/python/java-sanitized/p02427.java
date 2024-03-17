import java.util.Scanner;

public class p02427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < Math.pow(2, n); i++) {
            String s = "";
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    s += " " + j;
                }
            }
            System.out.println(i + ":" + s);
        }
    }
}
import java.util.*;

public class p02427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for (int i = 0; i < (1 << n); i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    sb.append(j);
                    sb.append(" ");
                }
            }
            System.out.println(i + ":" + sb.toString().trim());
        }
    }
}
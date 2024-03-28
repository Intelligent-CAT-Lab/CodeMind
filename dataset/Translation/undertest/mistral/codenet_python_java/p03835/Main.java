import java.util.*;

public class p03835 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k, s = sc.nextInt();
        int result = 0;
        for (int z = 0; z <= k; z++) {
            for (int y = 0; y <= k; y++) {
                if (z <= s - y) {
                    result += z;
                }
            }
        }
        System.out.println(result);
    }
}
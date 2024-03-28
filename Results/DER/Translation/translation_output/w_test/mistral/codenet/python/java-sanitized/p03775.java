import java.util.*;

public class p03775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        System.out.println(Collections.min(result));
    }
}
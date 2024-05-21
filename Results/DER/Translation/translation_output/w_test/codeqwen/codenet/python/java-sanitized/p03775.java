import java.util.ArrayList;
import java.util.List;

public class p03775 {
    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine());

        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        System.out.println(result.stream().min(Integer::compare).orElse(0));
    }
}
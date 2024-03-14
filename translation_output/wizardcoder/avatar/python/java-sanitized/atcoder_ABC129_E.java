import java.util.*;

public class atcoder_ABC129_E {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String l = sc.nextLine();
        int mod = (int) Math.pow(10, 9) + 7;
        List<Integer> pows = new ArrayList<>();
        pows.add(1);
        for (int i = 1; i <= 100000; i++) {
            pows.add((pows.get(i - 1) * 3) % mod);
        }
        int dp = 1;
        for (int i = 0; i < l.length(); i++) {
            if (l.charAt(i) == '1') {
                dp = (pows.get(i) + dp * 2) % mod;
            }
        }
        System.out.println(dp);
    }
}
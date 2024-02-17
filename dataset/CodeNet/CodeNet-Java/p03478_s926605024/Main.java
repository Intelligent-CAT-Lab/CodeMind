import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int answer = 0;

        char[] char_ary = null;
        int sum = 0;
        boolean add_flg = true;
        for (int i = A; i <= N; i++) {
            char_ary = Integer.toString(i).toCharArray();

            sum = 0;
            add_flg = true;
            for (char elm : char_ary) {
                sum += Character.getNumericValue(elm);
                if (sum > B) {
                    add_flg = false;
                    break;
                }
            }
            if (add_flg && sum >= A) {
                answer += i;
            }
        }

        System.out.println(answer);
    }
}
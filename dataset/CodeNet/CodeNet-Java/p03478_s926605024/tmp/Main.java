import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
System.out.println("[INST]5;N;sc.nextInt();"+N);
        int A = sc.nextInt();
System.out.println("[INST]6;A;sc.nextInt();"+A);
        int B = sc.nextInt();
System.out.println("[INST]7;B;sc.nextInt();"+B);
        sc.close();

        int answer = 0;

        char[] char_ary = null;
        int sum = 0;
        boolean add_flg = true;
        for (int i = A; i <= N; i++) {
            char_ary = Integer.toString(i).toCharArray();
System.out.println("[INST]16;char_ary;Integer.toString(i).toCharArray();"+char_ary);
System.out.println("[INST]16;None;Integer.toString(i);"+Integer.toString(i));

            sum = 0;
            add_flg = true;
            for (char elm : char_ary) {
                sum += Character.getNumericValue(elm);
System.out.println("[INST]21;sum;Character.getNumericValue(elm);"+sum);
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
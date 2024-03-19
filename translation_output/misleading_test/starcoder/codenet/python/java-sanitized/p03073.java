import java.util.*;
public class p03073 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        int zero_start = 0;
        int zero_start_counter = 0;
        for (int i = 0; i < n; i++) {
            if (zero_start!= Integer.parseInt(s.charAt(i) + "")) {
                zero_start_counter++;
            }
            zero_start = (zero_start + 1) % 2;
        }
        int one_start_counter = n - zero_start_counter;
        System.out.println(Math.min(zero_start_counter, one_start_counter));
    }
}
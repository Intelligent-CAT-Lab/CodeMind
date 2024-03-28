import java.util.Scanner;

public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int num_0 = 0;
        int num_1 = 0;
        for (int i = 0; i < s; i++) {
            if (s % 10 == 0) {
                num_0++;
            } else {
                num_1++;
            }
        }
        System.out.println(Math.min(num_0, num_1) * 2);
    }
}
import java.util.Scanner;

public class codeforces_373_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        long w = Long.parseLong(line[0]);
        long m = Long.parseLong(line[1]);
        long k = Long.parseLong(line[2]);
        long max_length = 0;
        long available_digits = w / k;

        while (available_digits > 0) {
            long current_cost_per_n = String.valueOf(m).length();
            long same_cost_until = (long) Math.pow(10, current_cost_per_n);
            long usable_numbers = same_cost_until - m;
            long use_digits = usable_numbers * current_cost_per_n;
            m = same_cost_until;

            if (available_digits >= use_digits) {
                max_length += usable_numbers;
                available_digits -= use_digits;
            } else {
                max_length += available_digits / current_cost_per_n;
                available_digits = 0;
            }
        }
        System.out.println(max_length);
        scanner.close();
    }
}
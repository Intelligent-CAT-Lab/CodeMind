import java.util.ArrayList;
import java.util.Scanner;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }
        int min = result.get(0);
        for (int num : result) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println(min);
    }
}
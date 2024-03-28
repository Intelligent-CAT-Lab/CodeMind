import java.util.Scanner;
import java.util.ArrayList;

public class p03775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                result.add(Math.max(String.valueOf(i).length(), String.valueOf(n / i).length()));
            }
        }

        int min = result.get(0);
        for (int i = 1; i < result.size(); i++) {
            if (result.get(i) < min) {
                min = result.get(i);
            }
        }

        System.out.println(min);
    }
}
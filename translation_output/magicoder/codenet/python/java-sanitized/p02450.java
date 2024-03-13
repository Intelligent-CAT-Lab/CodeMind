import java.util.*;

public class p02450 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        permute(numbers, 0, numbers.size() - 1);
    }

    private static void permute(List<Integer> numbers, int l, int r) {
        if (l == r) {
            System.out.println(numbers);
        } else {
            for (int i = l; i <= r; i++) {
                Collections.swap(numbers, l, i);
                permute(numbers, l + 1, r);
                Collections.swap(numbers, l, i);
            }
        }
    }
}
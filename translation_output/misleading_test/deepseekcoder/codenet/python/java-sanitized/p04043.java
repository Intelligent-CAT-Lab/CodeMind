import java.util.Arrays;
import java.util.Scanner;

public class p04043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (isSorted(new int[]{a, b, c})) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isSorted(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        Arrays.sort(sortedArray);
        return Arrays.equals(array, sortedArray);
    }
}
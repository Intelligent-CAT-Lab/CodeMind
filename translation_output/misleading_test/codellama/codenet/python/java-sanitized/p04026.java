import java.util.Scanner;

public class p04026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] result = findMatchingIndices(s);
        System.out.println(result[0] + " " + result[1]);
    }

    private static int[] findMatchingIndices(String s) {
        int[] result = new int[]{-1, -1};
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                result[0] = i + 1;
                result[1] = i + 2;
                break;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 2)) {
                result[0] = i + 1;
                result[1] = i + 3;
                break;
            }
        }
        return result;
    }
}
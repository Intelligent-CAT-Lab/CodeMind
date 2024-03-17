import java.util.Scanner;

public class p04026 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] indices = findIndices(s);
        System.out.println(indices[0] + " " + indices[1]);
    }

    private static int[] findIndices(String s) {
        int[] indices = new int[2];
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                indices[0] = i + 1;
                indices[1] = i + 2;
                break;
            }
        }
        if (indices[0] == 0 && indices[1] == 0) {
            for (int i = 0; i < s.length() - 2; i++) {
                if (s.charAt(i) == s.charAt(i + 2)) {
                    indices[0] = i + 1;
                    indices[1] = i + 3;
                    break;
                }
            }
        }
        if (indices[0] == 0 && indices[1] == 0) {
            indices[0] = -1;
            indices[1] = -1;
        }
        return indices;
    }
}
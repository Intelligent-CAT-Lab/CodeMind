import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        boolean b = S.replace("A", "").equals("KIHBR");
        if (b) {
            StringBuilder sb = new StringBuilder();
            for (char c : S.toCharArray()) {
                sb.append(c != 'A' ? c : "*");
            }
            String[] parts = sb.toString().split("\\*");
            int[] L = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                L[i] = parts[i].length();
            }
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < L.length; i++) {
                if (L[i] > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}
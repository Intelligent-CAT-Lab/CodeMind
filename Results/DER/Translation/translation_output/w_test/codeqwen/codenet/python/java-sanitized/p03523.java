import java.util.Scanner;

public class p03523 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.nextLine();
        StringBuilder sb = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (c != 'A') {
                sb.append(c);
            }
        }
        String result = sb.toString();
        boolean b = result.equals("KIHBR");
        if (b) {
            String[] split = result.split("(?<!^)A");
            int[] X = {1, 0, 0, 1, 1, 1, 1};
            for (int i = 0; i < split.length; i++) {
                if (split[i].length() > X[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}
import java.util.Scanner;

public class p02775 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] n = input.toCharArray();
        int s = 0;
        int res = 0;
        for (int i = n.length - 1; i >= 0; i--) {
            int ni = Character.getNumericValue(n[i]);
            int k = ni + s;
            if (k < 5 || (k == 5 && Character.getNumericValue(n[i + 1]) < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }
        res += s;
        System.out.println(res);
    }
}
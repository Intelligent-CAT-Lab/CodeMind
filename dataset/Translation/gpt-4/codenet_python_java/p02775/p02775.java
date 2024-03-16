import java.util.Scanner;

public class p02775 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = new StringBuilder(scanner.next()).reverse().toString();
        int[] n = new int[input.length() + 1];

        for (int i = 0; i < input.length(); i++) {
            n[i] = Character.getNumericValue(input.charAt(i));
        }

        int s = 0;
        int res = 0;

        for (int i = 0; i < n.length - 1; i++) {
            int k = n[i] + s;
            if (k < 5 || (k == 5 && Character.getNumericValue(input.charAt(i)) < 5)) {
                res += k;
                s = 0;
            } else {
                res += 10 - k;
                s = 1;
            }
        }

        res += s;
        System.out.println(res);
        scanner.close();
    }
}
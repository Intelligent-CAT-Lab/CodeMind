import java.util.Scanner;
import java.util.stream.IntStream;

public class atcoder_ABC155_E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int pp = 0;
        int na = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            int cc = na + Integer.parseInt(input.substring(i, i + 1));
            na = 0;
            if (cc <= 4) {
                pp += cc;
            } else {
                na = 1;
                if (i == input.length() - 1) {
                    pp += 1;
                }
                pp += 10 - cc;
            }
        }
        System.out.println(pp);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
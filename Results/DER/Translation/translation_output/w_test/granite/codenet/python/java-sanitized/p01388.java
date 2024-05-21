import java.util.Scanner;

public class p01388 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int kCount = 0;
        int uCount = 0;
        int pCount = 0;
        int cCount = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'K') {
                kCount++;
            } else if (c == 'U') {
                uCount++;
            } else if (c == 'P') {
                pCount++;
            } else if (c == 'C') {
                cCount++;
            }
        }

        int minCount = Math.min(kCount, Math.min(uCount, Math.min(pCount, cCount)));
        System.out.println(minCount);
    }
}
import java.util.Scanner;

public class p03534 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] counts = new int[3];
        for (char c : s.toCharArray()) {
            switch (c) {
                case 'a':
                    counts[0]++;
                    break;
                case 'b':
                    counts[1]++;
                    break;
                case 'c':
                    counts[2]++;
                    break;
            }
        }
        int a = counts[0];
        int b = counts[1];
        int c = counts[2];
        int maxDiff = Math.max(Math.abs(a - b), Math.max(Math.abs(b - c), Math.abs(c - a)));
        if (maxDiff <= 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
import java.util.Arrays;
import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int[] memory = new int[121];
        Arrays.fill(memory, 0);
        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 30; i++) {
            r.append("+".repeat(i + 1)).append(">");
        }
        r.append("<".repeat(10));
        int point = 0;
        for (char c : s.toCharArray()) {
            int n = c - 'A' / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;
            int l = Math.abs(memory[point] - c - 'A');
            if (memory[point] < c - 'A') {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory[point] = c - 'A';
            r.append(".");
        }
        System.out.println(r.toString());
    }
}
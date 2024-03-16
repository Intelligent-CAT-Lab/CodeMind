import java.util.Arrays;
import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[10];
        Arrays.fill(memory, 0);
        StringBuilder r = new StringBuilder();

        for (int i = 0; i < memory.length; i++) {
            r.append(memory[i] == 0 ? '>' : '<');
        }

        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = c - '0' - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(d > 0 ? '>' : '<');
            } else {
                r.append(d > 0 ? '>' : '<');
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append(l > 0 ? '+' : '-');
            } else {
                r.append(l > 0 ? '+' : '-');
            }
            memory[point] = c;

            r.append('.');
        }

        System.out.println(r.toString());
    }
}
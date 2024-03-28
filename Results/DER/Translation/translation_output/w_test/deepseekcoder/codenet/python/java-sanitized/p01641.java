import java.util.Scanner;
import java.lang.Math;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();

        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) memory[i] = 30 + i * 10;
        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) r.append(">".repeat(i));
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int c_val = (int) c;
            int n = c_val / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) r.append(">".repeat(d));
            else r.append("<".repeat(d));
            point = n;

            int l = Math.abs(memory[point] - c_val);
            if (memory[point] < c_val) r.append("+".repeat(l));
            else r.append("-".repeat(l));
            memory[point] = c_val;

            r.append(".");
        }

        System.out.println(r);
    }
}
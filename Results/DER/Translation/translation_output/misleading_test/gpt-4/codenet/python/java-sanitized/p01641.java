import java.util.Scanner;
import java.lang.Math;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();

        int[] memory = new int[10];
        for (int i = 0; i < memory.length; i++) {
            memory[i] = 30 + i * 10;
        }

        StringBuilder r = new StringBuilder();
        for (int value : memory) {
            for (int j = 0; j < value; j++) {
                r.append('+');
            }
            r.append('>');
        }
        r.append("<".repeat(memory.length));

        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = ((int)c) / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory[point] = c;

            r.append('.');
        }

        System.out.println(r);
    }
}
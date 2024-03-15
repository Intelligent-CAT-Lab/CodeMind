import java.util.ArrayList;
import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // We'll assume the registered input is a line of text.
        String s = scanner.nextLine();
        
        ArrayList<Integer> memory = new ArrayList<>();
        for (int i = 30; i <= 120; i += 10) {
            memory.add(i);
        }

        StringBuilder r = new StringBuilder();
        for (int i = 30; i <= 120; i += 10) {
            for (int j = 0; j < i; j++) {
                r.append('+');
            }
            r.append('>');
        }
        for (int i = 0; i < 10; i++) {
            r.append('<');
        }

        int point = 0;
        for (char ch : s.toCharArray()) {
            int c = (int) ch;
            int n = c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                for (int i = 0; i < d; i++) {
                    r.append('>');
                }
            } else {
                for (int i = 0; i < d; i++) {
                    r.append('<');
                }
            }
            point = n;

            int l = Math.abs(memory.get(point) - c);
            if (memory.get(point) < c) {
                for (int i = 0; i < l; i++) {
                    r.append('+');
                }
            } else {
                for (int i = 0; i < l; i++) {
                    r.append('-');
                }
            }
            memory.set(point, c);

            r.append('.');
        }

        System.out.println(r.toString());
    }
}
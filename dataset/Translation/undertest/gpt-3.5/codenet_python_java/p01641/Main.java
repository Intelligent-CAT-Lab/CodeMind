import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) {
            memory[i] = 30 + i * 10;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < memory[i]-30; j++) {
                r.append("+");
            }
            r.append(">");
        }
        for (int i = 0; i < 10; i++) {
            r.append("<");
        }

        int point = 0;
        for (char c : s.toCharArray()) {
            int value = (int) c;
            int n = value / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                for (int i = 0; i < d; i++) {
                    r.append(">");
                }
            } else {
                for (int i = 0; i < d; i++) {
                    r.append("<");
                }
            }
            point = n;

            int l = Math.abs(memory[point] - value);
            if (memory[point] < value) {
                for (int i = 0; i < l; i++) {
                    r.append("+");
                }
            } else {
                for (int i = 0; i < l; i++) {
                    r.append("-");
                }
            }
            memory[point] = value;

            r.append(".");
        }

        System.out.println(r.toString());
    }
}
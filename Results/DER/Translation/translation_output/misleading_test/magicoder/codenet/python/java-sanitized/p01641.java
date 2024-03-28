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
            r.append("+".repeat(memory[i] - 30));
            r.append(">");
        }
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int n = (int) c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">".repeat(d));
            } else {
                r.append("<".repeat(d));
            }
            point = n;

            int l = Math.abs(memory[point] - (int) c);
            if (memory[point] < (int) c) {
                r.append("+".repeat(l));
            } else {
                r.append("-".repeat(l));
            }
            memory[point] = (int) c;

            r.append(".");
        }

        System.out.println(r.toString());
    }
}
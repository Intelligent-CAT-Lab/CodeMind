import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[10];
        for (int i = 3; i < 12; i++) {
            memory[i-3] = i*10;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 3; i < 12; i++) {
            r.append("+".repeat(i) + ">");
        }
        r.append("<".repeat(10));

        int point = 0;
        for (char c : s.toCharArray()) {
            int num = c / 10 - 3;
            int diff = Math.abs(point - num);
            if (point < num) {
                r.append(">".repeat(diff));
            } else {
                r.append("<".repeat(diff));
            }
            point = num;

            int length = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append("+".repeat(length));
            } else {
                r.append("-".repeat(length));
            }
            memory[point] = c;

            r.append(".");
        }
        System.out.println(r.toString());
    }
}
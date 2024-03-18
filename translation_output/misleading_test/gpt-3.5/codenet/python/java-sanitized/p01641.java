import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[10];
        for (int i = 0; i < memory.length; i++) {
            memory[i] = 30 + i * 10;
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < memory.length; i++) {
            for (int j = 0; j < memory[i] - 30; j++) {
                result.append("+");
            }
            result.append(">");
        }
        for (int i = 0; i < 10; i++) {
            result.append("<");
        }

        int point = 0;
        for (char c : s.toCharArray()) {
            int ascii = (int) c;
            int n = ascii / 10 - 3;
            int d = Math.abs(point - n);

            if (point < n) {
                for (int i = 0; i < d; i++) {
                    result.append(">");
                }
            } else {
                for (int i = 0; i < d; i++) {
                    result.append("<");
                }
            }
            point = n;

            int diff = Math.abs(memory[point] - ascii);
            if (memory[point] < ascii) {
                for (int i = 0; i < diff; i++) {
                    result.append("+");
                }
            } else {
                for (int i = 0; i < diff; i++) {
                    result.append("-");
                }
            }
            memory[point] = ascii;

            result.append(".");
        }

        System.out.println(result.toString());
    }
}
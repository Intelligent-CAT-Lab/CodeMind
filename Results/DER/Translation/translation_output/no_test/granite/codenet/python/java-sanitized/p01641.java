import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] memory = new int[30];
        StringBuilder output = new StringBuilder();

        for (int i = 30; i < 121; i += 10) {
            output.append(String.join("", Collections.nCopies(i, "+")));
            output.append(">");
        }
        for (int i = 0; i < 10; i++) {
            output.append("<");
        }

        int point = 0;
        for (char c : input.toCharArray()) {
            int n = c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                output.append(String.join("", Collections.nCopies(d, ">")));
            } else {
                output.append(String.join("", Collections.nCopies(d, "<")));
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                output.append(String.join("", Collections.nCopies(l, "+")));
            } else {
                output.append(String.join("", Collections.nCopies(l, "-")));
            }
            memory[point] = c;

            output.append(".");
        }

        System.out.println(output.toString());
    }
}
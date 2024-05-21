import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        int[] memory = new int[30];
        StringBuilder brainfuck = new StringBuilder();

        brainfuck.append(String.join("", Collections.nCopies(30, "+")));
        brainfuck.append(String.join("", Collections.nCopies(30, ">")));
        brainfuck.append(String.join("", Collections.nCopies(10, "<")));

        int point = 0;
        for (char c : input.toCharArray()) {
            int value = (int) c;
            int n = value / 10 - 3;
            int distance = Math.abs(point - n);
            if (point < n) {
                brainfuck.append(String.join("", Collections.nCopies(distance, ">")));
            } else {
                brainfuck.append(String.join("", Collections.nCopies(distance, "<")));
            }
            point = n;

            int diff = Math.abs(memory[point] - value);
            if (memory[point] < value) {
                brainfuck.append(String.join("", Collections.nCopies(diff, "+")));
            } else {
                brainfuck.append(String.join("", Collections.nCopies(diff, "-")));
            }
            memory[point] = value;

            brainfuck.append(".");
        }

        System.out.println(brainfuck.toString());
    }
}
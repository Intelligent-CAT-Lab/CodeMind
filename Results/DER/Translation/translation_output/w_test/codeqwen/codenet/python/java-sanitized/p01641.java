import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[11];
        for (int i = 0; i < 11; i++) {
            memory[i] = 30 + i * 10;
        }

        StringBuilder r = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            r.append(new String(new char[memory[i] - 30]).replace("\0", "+"));
            r.append(">");
        }
        r.append(new String(new char[10]).replace("\0", "<"));

        int point = 0;
        for (char c : s.toCharArray()) {
            int n = (int) c / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(new String(new char[d]).replace("\0", ">"));
            } else {
                r.append(new String(new char[d]).replace("\0", "<"));
            }
            point = n;

            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r.append(new String(new char[l]).replace("\0", "+"));
            } else {
                r.append(new String(new char[l]).replace("\0", "-"));
            }
            memory[point] = c;

            r.append(".");
        }

        System.out.println(r.toString());
    }
}
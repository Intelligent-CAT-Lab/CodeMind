import java.util.Scanner;
import java.lang.Math;

public class p01641 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int[] memory = new int[12];
        for (int i = 0; i < 12; i++) {
            memory[i] = i * 10;
        }

        String r = "";
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = (int) s.charAt(i);
            int n = (int) Math.floor(c / 10) - 3;
            int d = (int) Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;

            int l = (int) Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = c;

            r += ".";
        }

        System.out.println(r);
    }
}
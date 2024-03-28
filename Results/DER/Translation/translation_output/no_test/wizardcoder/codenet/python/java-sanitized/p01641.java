import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) {
            memory[i] = 30 + i * 10;
        }

        String r = "";
        for (int i = 0; i < 10; i++) {
            r += "+".repeat(i) + ">";
        }
        r += "<".repeat(10);

        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (int) c - 48;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;

            int l = Math.abs(memory[point] - (int) c);
            if (memory[point] < (int) c) {
                r += "+".repeat(l);
            } else {
                r += "-".repeat(l);
            }
            memory[point] = (int) c;

            r += ".";
        }

        System.out.println(r);
    }
}
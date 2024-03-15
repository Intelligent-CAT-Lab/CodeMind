import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[10];
        String r = "";
        for (int i = 30; i < 121; i += 10) {
            for (int j = 0; j < i; j++) {
                r += "+";
            }
            r += ">";
        }
        r += "<".repeat(10);
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (c - '0') / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">".repeat(d);
            } else {
                r += "<".repeat(d);
            }
            point = n;
            int l = Math.abs(memory[point] - c);
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
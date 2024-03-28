import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[10];
        for (int i = 0; i < 10; i++) {
            memory[i] = i + 30;
        }
        String r = "";
        for (int i = 0; i < 10; i++) {
            r += "+" * memory[i] + ">";
        }
        r += "<" * 10;
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (c - '0') / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r += ">" * d;
            } else {
                r += "<" * d;
            }
            point = n;
            int l = Math.abs(memory[point] - c);
            if (memory[point] < c) {
                r += "+" * l;
            } else {
                r += "-" * l;
            }
            memory[point] = c;
            r += ".";
        }
        System.out.println(r);
    }
}
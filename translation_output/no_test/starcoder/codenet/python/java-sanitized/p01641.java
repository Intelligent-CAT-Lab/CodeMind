import java.util.*;
public class p01641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] memory = new int[30];
        for (int i = 0; i < 30; i++) {
            memory[i] = i + 30;
        }
        String r = "";
        for (int i = 0; i < 30; i++) {
            r += "+";
        }
        r += ">";
        for (int i = 30; i < 120; i += 10) {
            r += "+";
        }
        r += "<";
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            int n = c / 10 - 3;
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
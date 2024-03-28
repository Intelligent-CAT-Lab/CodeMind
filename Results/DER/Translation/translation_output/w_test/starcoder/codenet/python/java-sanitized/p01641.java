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
            for (int j = i; j < i + 10; j++) {
                r += ">";
            }
        }
        r += "<";
        for (int i = 0; i < 10; i++) {
            r += "-";
        }
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int n = (int) c - 48;
            int d = Math.abs(point - n);
            if (point < n) {
                for (int j = 0; j < d; j++) {
                    r += ">";
                }
            } else {
                for (int j = 0; j < d; j++) {
                    r += "<";
                }
            }
            point = n;
            int l = Math.abs(memory[point] - n);
            if (memory[point] < n) {
                for (int j = 0; j < l; j++) {
                    r += "+";
                }
            } else {
                for (int j = 0; j < l; j++) {
                    r += "-";
                }
            }
            memory[point] = n;
            r += ".";
        }
        System.out.println(r);
    }
}
import java.util.Scanner;

public class p01641 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] memory = new int[120];
        StringBuilder r = new StringBuilder();
        r.append("+>");
        for (int i = 30; i < 121; i += 10) {
            r.append("+>");
        }
        r.append("<");
        int point = 0;
        for (char c : s.toCharArray()) {
            int cInt = (int) c;
            int n = cInt / 10 - 3;
            int d = Math.abs(point - n);
            if (point < n) {
                r.append(">");
                for (int i = 0; i < d; i++) {
                    r.append(">");
                }
            } else {
                r.append("<");
                for (int i = 0; i < d; i++) {
                    r.append("<");
                }
            }
            point = n;
            int l = Math.abs(memory[point] - cInt);
            if (memory[point] < cInt) {
                r.append("+");
                for (int i = 0; i < l; i++) {
                    r.append("+");
                }
            } else {
                r.append("-");
                for (int i = 0; i < l; i++) {
                    r.append("-");
                }
            }
            memory[point] = cInt;
            r.append(".");
        }
        System.out.println(r.toString());
    }
}
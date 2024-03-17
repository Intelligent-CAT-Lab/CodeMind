import java.util.*;

public class p02004 {
    static int[] dd = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};
    static int[] ddn = {{-1, 0}, {-1, 1}, {0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] rr = new int[10000];

        while (true) {
            String n = sc.nextLine();
            if (n.equals("0")) {
                break;
            }
            rr[rr.length] = f(n);
        }

        for (int i = 0; i < rr.length; i++) {
            System.out.print(rr[i] + " ");
        }
        System.out.println();
    }

    static int f(String n) {
        int r = 0;
        int t = 0;
        for (char c : n.toCharArray()) {
            if (c == 'R') {
                t++;
                if (t == 4) {
                    r++;
                    t = 0;
                }
            } else {
                t--;
                if (t == -4) {
                    t = 0;
                }
            }
        }
        return r;
    }
}
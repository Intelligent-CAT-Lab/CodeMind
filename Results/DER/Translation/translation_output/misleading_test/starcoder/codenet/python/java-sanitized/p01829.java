import java.util.*;
public class p01829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int l = s.length();
        int n = Integer.parseInt(s);
        int m = Integer.MAX_VALUE;
        String r = "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l1 = 0; l1 < 10; l1++) {
                        for (int l2 = 0; l2 < 10; l2++) {
                            for (int l3 = 0; l3 < 10; l3++) {
                                for (int l4 = 0; l4 < 10; l4++) {
                                    for (int l5 = 0; l5 < 10; l5++) {
                                        for (int l6 = 0; l6 < 10; l6++) {
                                            int a = i * 1000000 + j * 100000 + k * 10000 + l1 * 1000 + l2 * 100 + l3 * 10 + l4;
                                            int b = l5 * 1000000 + l6 * 100000 + a;
                                            int tm = Math.max(Math.abs(n - b), Math.abs(n - b) + 10000000);
                                            if (m > tm) {
                                                m = tm;
                                                r = l4 + "" + l3 + "" + l2 + "" + l1 + "" + k + "" + j + "" + i;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(r);
    }
}
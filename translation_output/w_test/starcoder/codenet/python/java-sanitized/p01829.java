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
                                            for (int l7 = 0; l7 < 10; l7++) {
                                                for (int l8 = 0; l8 < 10; l8++) {
                                                    for (int l9 = 0; l9 < 10; l9++) {
                                                        int a = i * 10000000 + j * 1000000 + k * 100000 + l1 * 10000 + l2 * 1000 + l3 * 100 + l4 * 10 + l5;
                                                        int b = l6 * 10000000 + l7 * 1000000 + l8 * 100000 + l9;
                                                        int tm = Math.max(Math.abs(n - a), Math.abs(n - b));
                                                        if (m > tm) {
                                                            m = tm;
                                                            r = "" + i + j + k + l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8 + l9;
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
                }
            }
        }
        System.out.println(r);
    }
}
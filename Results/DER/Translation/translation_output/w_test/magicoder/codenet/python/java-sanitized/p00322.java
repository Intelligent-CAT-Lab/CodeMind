import java.util.*;

public class p00322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = new int[9];
        for (int i = 0; i < 9; i++) {
            input[i] = scanner.nextInt();
        }
        int cnt = 0;
        for (int a : makeList(input[0])) {
            for (int b : makeList(input[1])) {
                if (b != a) {
                    for (int c : makeList(input[2])) {
                        if (c != a && c != b) {
                            for (int d : makeList(input[3])) {
                                if (d != a && d != b && d != c) {
                                    for (int e : makeList(input[4])) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : makeList(input[5])) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g : makeList(input[6])) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h : makeList(input[7])) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i : makeList(input[8])) {
                                                                        if (i != a && i != b && i != c && i != d && i != e && i != f && i != g && i != h) {
                                                                            if (a + 10 * b + c + 100 * d + 10 * e + f == 100 * g + 10 * h + i) {
                                                                                cnt++;
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
                        }
                    }
                }
            }
        }
        System.out.println(cnt);
    }

    public static List<Integer> makeList(int x) {
        List<Integer> xList = new ArrayList<>();
        if (x != -1) {
            xList.add(x);
        } else {
            for (int i = 1; i <= 9; i++) {
                xList.add(i);
            }
        }
        return xList;
    }
}
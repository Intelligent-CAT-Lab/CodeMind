import java.util.*;

public class p00322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[9];
        for (int i = 0; i < 9; i++) {
            inputs[i] = scanner.nextInt();
        }
        scanner.close();

        int cnt = 0;
        for (int a : makeList(inputs[0])) {
            for (int b : makeList(inputs[1])) {
                if (b != a) {
                    for (int c : makeList(inputs[2])) {
                        if (c != a && c != b) {
                            for (int d : makeList(inputs[3])) {
                                if (d != a && d != b && d != c) {
                                    for (int e : makeList(inputs[4])) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : makeList(inputs[5])) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g : makeList(inputs[6])) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h : makeList(inputs[7])) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i : makeList(inputs[8])) {
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

    private static List<Integer> makeList(int x) {
        List<Integer> xList;
        if (x != -1) {
            xList = Arrays.asList(x);
        } else {
            xList = new ArrayList<>();
            for (int i = 1; i <= 9; i++) {
                xList.add(i);
            }
        }
        return xList;
    }
}
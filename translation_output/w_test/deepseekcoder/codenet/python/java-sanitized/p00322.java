import java.util.*;

public class p00322 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> aList = makeList(scanner.nextInt());
        List<Integer> bList = makeList(scanner.nextInt());
        List<Integer> cList = makeList(scanner.nextInt());
        List<Integer> dList = makeList(scanner.nextInt());
        List<Integer> eList = makeList(scanner.nextInt());
        List<Integer> fList = makeList(scanner.nextInt());
        List<Integer> gList = makeList(scanner.nextInt());
        List<Integer> hList = makeList(scanner.nextInt());
        List<Integer> iList = makeList(scanner.nextInt());

        int cnt = 0;
        for (int a : aList) {
            for (int b : bList) {
                if (b != a) {
                    for (int c : cList) {
                        if (c != a && c != b) {
                            for (int d : dList) {
                                if (d != a && d != b && d != c) {
                                    for (int e : eList) {
                                        if (e != a && e != b && e != c && e != d) {
                                            for (int f : fList) {
                                                if (f != a && f != b && f != c && f != d && f != e) {
                                                    for (int g : gList) {
                                                        if (g != a && g != b && g != c && g != d && g != e && g != f) {
                                                            for (int h : hList) {
                                                                if (h != a && h != b && h != c && h != d && h != e && h != f && h != g) {
                                                                    for (int i : iList) {
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
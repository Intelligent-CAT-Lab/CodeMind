import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            String s = sc.next();
            if (s.equals("000")) {
                break;
            }
            int max = -1;
            for (int i = 0; i < s.length(); i++) {
                for (int j = i + 1; j < s.length(); j++) {
                    String s1 = s.substring(0, i) + s.substring(i, j);
                    String s2 = s.substring(j, s.length());
                    String s3 = calc(s1, s2);
                    if (s3!= null) {
                        int v = Integer.parseInt(s3, 2);
                        if (v >= 0 && v < 1024) {
                            max = Math.max(max, v);
                        }
                    }
                }
            }
            System.out.println(max);
        }
    }

    static String calc(String s1, String s2) {
        if (s1.equals("0") || s1.equals("1") || s2.equals("0") || s2.equals("1")) {
            return null;
        }
        if (s1.contains(".") || s2.contains(".")) {
            return null;
        }
        if (s1.contains("+") || s1.contains("-") || s1.contains("*") || s2.contains("+") || s2.contains("-") || s2.contains("*")) {
            return null;
        }
        int v1 = Integer.parseInt(s1, 2);
        int v2 = Integer.parseInt(s2, 2);
        if (v1 < 0 || v1 >= 1024 || v2 < 0 || v2 >= 1024) {
            return null;
        }
        int v = v1 + v2;
        if (v < 0 || v >= 1024) {
            return null;
        }
        return Integer.toBinaryString(v);
    }
}
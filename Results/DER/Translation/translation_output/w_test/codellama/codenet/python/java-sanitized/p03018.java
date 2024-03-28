public class p03018 {
    public static void main(String[] args) {
        String input = "ABCABC";
        int ans = 0;
        int a = 0;
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == 'A') {
                a += 1;
                i += 1;
            } else if (input.substring(i, i + 2).equals("BC")) {
                ans += a;
                i += 2;
            } else {
                a = 0;
                i += 1;
            }
        }
        System.out.println(ans);
    }
}
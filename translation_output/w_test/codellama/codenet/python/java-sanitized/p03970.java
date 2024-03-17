public class p03970 {
    public static void main(String[] args) {
        String input = "C0DEFESTIVAL2O16";
        String A = "CODEFESTIVAL2016";
        int cnt = 0;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != input.charAt(i)) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
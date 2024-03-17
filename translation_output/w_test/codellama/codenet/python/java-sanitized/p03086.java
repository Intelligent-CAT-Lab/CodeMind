public class p03086 {
    public static void main(String[] args) {
        String input = "ATCODER";
        int ans = 0;
        int length = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                length++;
                ans = Math.max(ans, length);
            } else {
                length = 0;
            }
        }
        System.out.println(ans);
    }
}
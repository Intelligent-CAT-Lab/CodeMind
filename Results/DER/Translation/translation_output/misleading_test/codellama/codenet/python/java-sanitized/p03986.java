public class p03986 {
    public static void main(String[] args) {
        String input = "TSTTSS";
        int ans = 0;
        int memo = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'T') {
                if (memo == 0) {
                    // do nothing
                } else {
                    memo--;
                }
            } else {
                memo++;
            }
        }
        System.out.println(memo * 2);
    }
}
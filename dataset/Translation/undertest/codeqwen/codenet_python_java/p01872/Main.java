public class p01872 {
    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        int ans = check(s.toCharArray());
        System.out.println(ans != -1 ? String.valueOf(ans) : "MULTIPLE");
    }

    public static int check(char[] s) {
        int index = -1;
        for (int i = 0; i < s.length; i++) {
            if (s[i] == '?') {
                index = i;
                break;
            }
        }
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            char c = (char) ('0' + i);
            char[] fixedNumber = new char[s.length];
            System.arraycopy(s, 0, fixedNumber, 0, s.length);
            fixedNumber[index] = c;
            if (isCollect(fixedNumber)) {
                cnt++;
                int ret = i;
                if (cnt == 1) return ret;
            }
        }
        return -1;
    }

    public static boolean isCollect(char[] fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Character.getNumericValue(fixedNumber[i]) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Character.getNumericValue(fixedNumber[i]) * (i - 5);
        }
        int last = 11 - score % 11;
        return (last == Character.getNumericValue(fixedNumber[0]) || (last >= 10 && fixedNumber[0] == '0'));
    }
}
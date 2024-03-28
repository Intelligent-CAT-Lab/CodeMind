public class p01872 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = new StringBuilder(scanner.next()).reverse().toString();
        Integer ans = check(input);
        System.out.println(ans != null ? ans : "MULTIPLE");
    }

    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Character.getNumericValue(fixedNumber.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Character.getNumericValue(fixedNumber.charAt(i)) * (i - 5);
        }

        int last = 11 - score % 11;
        if (String.valueOf(last).equals(Character.toString(fixedNumber.charAt(0)))
                || (last >= 10 && fixedNumber.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }

    public static Integer check(String s) {
        int index = s.indexOf('?');
        int cnt = 0;
        Integer ret = null;
        for (int i = 0; i < 10; i++) {
            char c = Character.forDigit(i, 10);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) return ret;
        else return null;
    }
}
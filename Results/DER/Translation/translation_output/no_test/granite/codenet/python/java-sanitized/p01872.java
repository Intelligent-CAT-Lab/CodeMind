public class p01872 {
    public static boolean isCollect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.substring(0, 1)) || (last >= 10 && fixedNumber.substring(0, 1).equals("0"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        int ret = -1;
        for (int i = 0; i < 10; i++) {
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCollect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) {
            return ret;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        String s = new StringBuilder(new String(java.util.Scanner.class.getDeclaredMethod("nextLine", new Class<?>[]{}).invoke(java.util.Scanner.class.getDeclaredMethod("nextLine", new Class<?>[]{}).invoke(new java.util.Scanner(System.in), new Object[]{}), new Object[]{})).reverse().toString();
        int ans = check(s);
        if (ans!= -1) {
            System.out.println(ans);
        } else {
            System.out.println("MULTIPLE");
        }
    }
}
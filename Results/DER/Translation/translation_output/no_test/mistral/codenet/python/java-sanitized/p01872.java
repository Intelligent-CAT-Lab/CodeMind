public class p01872 {
    public static boolean is_collect(String fixed_number) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixed_number.charAt(i)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixed_number.charAt(i)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (last == Integer.parseInt(fixed_number.charAt(0)) || (last >= 10 && fixed_number.charAt(0) == '0')) {
            return true;
        } else {
            return false;
        }
    }

    public static int check(String s) {
        int index = s.indexOf("?");
        int cnt = 0;
        for (int i = 0; i < 10; i++) {
            String c = Integer.toString(i);
            String fixed_number = s.substring(0, index) + c + s.substring(index + 1);
            if (is_collect(fixed_number)) {
                cnt++;
                return i;
            }
        }
        if (cnt == 1) {
            return -1;
        } else {
            return -2;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.substring(0, s.length() - 1);
        int ans = check(s);
        if (ans == -1) {
            System.out.println("MULTIPLE");
        } else {
            System.out.println(ans);
        }
    }
}
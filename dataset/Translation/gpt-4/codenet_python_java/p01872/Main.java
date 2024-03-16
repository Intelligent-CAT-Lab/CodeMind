public class p01872 {
    public static boolean isCorrect(String fixedNumber) {
        int score = 0;
        for (int i = 1; i < 7; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i + 1);
        }
        for (int i = 7; i < 12; i++) {
            score += Integer.parseInt(fixedNumber.substring(i, i + 1)) * (i - 5);
        }
        int last = 11 - score % 11;
        if (String.valueOf(last).equals(fixedNumber.substring(0, 1)) 
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
            String c = String.valueOf(i);
            String fixedNumber = s.substring(0, index) + c + s.substring(index + 1);
            if (isCorrect(fixedNumber)) {
                cnt++;
                ret = i;
            }
        }
        if (cnt == 1) {
            return ret;
        } else {
            return null;
        }
    }
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String input = new StringBuilder(scanner.next()).reverse().toString();
        Integer ans = check(input);
        System.out.println(ans != null ? ans : "MULTIPLE");
        scanner.close();
    }
}
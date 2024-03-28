public class p03965 {
    public static void main(String[] args) {
        String s = "gpg";
        int len = s.length();
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'p') {
                count++;
            }
        }
        System.out.println(len / 2 - count);
    }
}
public class p03587 {
    public static void main(String[] args) {
        String s = "111100";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                count++;
            }
        }
        System.out.println(count);
    }
}
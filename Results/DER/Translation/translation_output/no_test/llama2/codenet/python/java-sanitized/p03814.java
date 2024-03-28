public class p03814 {
    public int reverseVowels(String s) {
        int a_index = 0;
        int z_index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                a_index = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                z_index = i;
                break;
            }
        }
        return z_index - a_index + 1;
    }
}
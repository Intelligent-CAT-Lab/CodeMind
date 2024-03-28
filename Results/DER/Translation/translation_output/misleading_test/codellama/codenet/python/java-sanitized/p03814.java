public class p03814 {
    public static void main(String[] args) {
        String s = "QWERTYASDFZXCV";
        int aIndex = 0;
        int zIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                aIndex = i;
                break;
            }
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == 'Z') {
                zIndex = i;
                break;
            }
        }
        System.out.println(zIndex - aIndex + 1);
    }
}



After the loops are finished, it prints the difference between `zIndex` and `aIndex` plus 1, which is the number of characters between the first 'A' and the last 'Z' in the string.
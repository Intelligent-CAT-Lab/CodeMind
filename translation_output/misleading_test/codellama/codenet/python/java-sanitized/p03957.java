public class p03957 {
    public static void main(String[] args) {
        String s = "CODEFESTIVAL";
        String ss = "";
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (p == 0 && s.charAt(i) == 'C') {
                p = 1;
            } else if (p == 1 && s.charAt(i) == 'F') {
                p = 2;
            }
        }
        System.out.println("Yes" + (p == 2 ? "Y" : "N") + "s");
    }
}
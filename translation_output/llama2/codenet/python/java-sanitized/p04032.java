public class p04032 {
    public static void main(String[] args) {
        String S = "12";
        if (S.length() == 2) {
            if (S.charAt(0) == S.charAt(1)) {
                System.out.println(1, 2);
            } else {
                System.out.println(-1, -1);
            }
            System.exit(0);
        }
        for (int i = 0; i < S.length() - 3; i++) {
            List<Character> s = new ArrayList<>();
            for (int j = i; j < i + 3; j++) {
                s.add(S.charAt(j));
            }
            if (s.size() <= 2) {
                System.out.println(i + 1, i + 3);
                break;
            }
        }
        System.out.println(-1, -1);
    }
}
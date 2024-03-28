public class atcoder_ABC136_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            String s = String.valueOf(i);
            if (s.length() % 2 == 1) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}



$ java Main 99999
90909
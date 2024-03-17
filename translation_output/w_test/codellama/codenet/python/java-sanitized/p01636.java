public class p01636 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int ans = 0;
        for (int i = 1; i < input.length(); i++) {
            String df = input.substring(0, i);
            String sm = input.substring(i);
            if (sm.charAt(0) == '0') continue;
            int dfInt = Integer.parseInt(df);
            int smInt = Integer.parseInt(sm);
            if ((dfInt + smInt) % 2 == 0 && smInt >= dfInt && (smInt - dfInt) % 2 == 0) {
                ans++;
            }
        }
        if (Integer.parseInt(input) % 2 == 0) {
            ans++;
        }
        System.out.println(ans);
    }
}
public class atcoder_ABC120_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int num0 = 0;
        int num1 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                num0++;
            } else {
                num1++;
            }
        }
        System.out.println(Math.min(num0, num1) * 2);
    }
}
public class codeforces_32_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '.') {
                result += "0";
            } else if (input.charAt(i) == ' ') {
                result += "1";
            } else {
                result += "2";
            }
        }
        System.out.println(result);
    }
}
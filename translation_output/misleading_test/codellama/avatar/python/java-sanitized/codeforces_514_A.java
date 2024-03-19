public class codeforces_514_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String result = "";
        if (input.length() != 1) {
            if (input.charAt(0) == '9') {
                result = "9";
                input = input.substring(1);
            }
            for (int i = 0; i < input.length(); i++) {
                if (Character.getNumericValue(input.charAt(i)) > 4) {
                    int n = 9 - Character.getNumericValue(input.charAt(i));
                    result += String.valueOf(n);
                } else {
                    result += input.charAt(i);
                }
            }
        } else {
            result = input;
        }
        System.out.println(Integer.parseInt(result));
    }
}
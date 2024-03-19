public class p03242 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '1') {
                output += "9";
            } else {
                output += "1";
            }
        }
        System.out.println(output);
    }
}